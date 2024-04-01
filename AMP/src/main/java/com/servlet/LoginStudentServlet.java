package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.studentDAO;
import com.db.dbconnect;
import com.entity.Student;

@WebServlet("/login_student")
public class LoginStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        studentDAO studentDAO = new studentDAO(dbconnect.getConn()); // Assuming this is your DAO setup

        if (studentDAO.validateStudent(email, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", email);
            response.sendRedirect("student_dashboard.jsp"); // Redirect to student dashboard upon successful login
        } else {
            request.setAttribute("errorMessage", "Invalid credentials"); // Set error message attribute
            request.getRequestDispatcher("login.jsp").forward(request, response); // Forward back to login.jsp
        }
    }
}
