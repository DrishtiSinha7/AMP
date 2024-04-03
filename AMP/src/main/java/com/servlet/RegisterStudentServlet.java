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

import com.dao.studentDAO; // Lowercase s for studentDAO
import com.db.dbconnect; // Assuming this is the correct package for your database connection
import com.entity.Student;

@WebServlet("/register_student")
public class RegisterStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String plainPassword = req.getParameter("ps");
            String phone = req.getParameter("phone"); // Assuming this parameter exists in your form

            // Hashing the password using MD5
            String hashedPassword = hashPasswordMD5(plainPassword);

            HttpSession session = req.getSession();

            // Create a new studentDAO object (lowercase s for studentDAO)
            studentDAO studentDAO = new studentDAO(dbconnect.getConn()); // Assuming dbconnect is correct
            Student student = new Student(name, email, hashedPassword, phone); // Using the correct constructor

            // Attempt to add the student to the database
            boolean success = studentDAO.addStudent(student);

            if (success) {
                session.setAttribute("succMsg", "Student Registration Successful");
                resp.sendRedirect("login.jsp");
            } else {
                session.setAttribute("errMsg", "Something went wrong while creating Student");
                resp.sendRedirect("singup.jsp");
            }
        } catch (Exception e) {
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
