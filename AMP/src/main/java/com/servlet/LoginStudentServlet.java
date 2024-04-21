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

import com.dao.studentDAO;
import com.db.dbconnect;
import com.entity.Student;

@WebServlet("/login_student")
public class LoginStudentServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    String email = request.getParameter("email");
	    String plainPassword = request.getParameter("password");
	    
	    String hashedPassword = null; // Initialize to null

	    try {
	        // Hashing the password using MD5
	        hashedPassword = hashPasswordMD5(plainPassword);
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace(); // Handle the exception (e.g., log it)
	        hashedPassword = ""; // Set a default value or handle it appropriately
	    }

	    studentDAO studentDAO = new studentDAO(dbconnect.getConn()); // Assuming this is your DAO setup
	    
	    if (hashedPassword != null && studentDAO.validateStudent(email, hashedPassword)) {
	        HttpSession session = request.getSession();
	        session.setAttribute("loggedInUser", email);
	        response.sendRedirect("student_dashboard.jsp"); // Redirect to student dashboard upon successful login
	    } else {
	        request.setAttribute("errorMessage", "Invalid credentials"); // Set error message attribute
	        request.getRequestDispatcher("login.jsp").forward(request, response); // Forward back to login.jsp
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

