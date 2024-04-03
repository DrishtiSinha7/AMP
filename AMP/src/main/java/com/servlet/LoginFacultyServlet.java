package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.facultyDAO;
import com.db.dbconnect;
import com.entity.Faculty;

@WebServlet("/login_faculty")
public class LoginFacultyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        facultyDAO facultyDAO = new facultyDAO(dbconnect.getConn()); // Assuming this is your DAO setup

        if (facultyDAO.validateFaculty(email, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", email);
            response.sendRedirect("faculty_dashboard.jsp"); 
     
        } else {
            request.setAttribute("errorMessage", "Invalid credentials"); // Set error message attribute
            request.getRequestDispatcher("login.jsp").forward(request, response); // Forward back to login.jsp
        }
    }
}
