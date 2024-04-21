package com.servlet;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.facultyDAO;
import com.db.dbconnect;
import com.entity.Faculty;

@WebServlet("/register_faculty")
public class RegisterFacultyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String plainPassword = req.getParameter("ps"); 
            String phone= getInitParameter("phone");
            
           

            // Hashing the password using MD5
            String hashedPassword = hashPasswordMD5(plainPassword);

            // Create a new FacultyDAO object
            facultyDAO facultyDAO = new facultyDAO(dbconnect.getConn());
            Faculty faculty = new Faculty(name, email, hashedPassword, phone);

            // Attempt to add the faculty to the database
            boolean success = facultyDAO.addFaculty(faculty);

            if (success) {
                HttpSession session = req.getSession();
                session.setAttribute("successMessage", "Faculty Registration Successful");
                resp.sendRedirect("login.jsp");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("errorMessage", "Failed to register faculty");
                resp.sendRedirect("signup.jsp");
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // Handle invalid password
            e.printStackTrace();
        }
    }

    // Hashing method using MD5
    private String hashPasswordMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        return new BigInteger(1, digest).toString(16);
    }
}
