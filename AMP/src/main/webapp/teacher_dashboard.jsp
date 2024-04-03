<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teacher Dashboard</title>
<style>
    /* Your CSS styles here */
    .container {
        margin: 20px;
    }
    .card {
        background-color: #f8f9fa;
        border-radius: 10px;
        padding: 20px;
        margin-bottom: 20px;
    }
    h2 {
        color: #186F65;
    }
    .btn {
        background-color: #186F65;
        color: #fff;
        border: none;
        padding: 8px 16px;
        border-radius: 5px;
        cursor: pointer;
        margin-right: 10px;
    }
</style>
<%@include file='all_component/all_css.jsp'%>
</head>
<body>
<%@include file='all_component/navbar.jsp'%>
<div class="container">
    <h2>Welcome to Teacher Dashboard</h2>
    <div class="row">
        <div class="col-md-6">
            <div class="card">
                <h3>Course Information</h3>
                <p>List of courses you are teaching:</p>
                <ul>
                    <li>Course 1</li>
                    <li>Course 2</li>
                    <li>Course 3</li>
                    <!-- Add dynamic course information here -->
                </ul>
            </div>
        </div>
        <div class="col-md-6">
            <div class="card">
                <h3>Student Grades</h3>
                <p>View and manage grades for your students:</p>
                <ul>
                    <li>Student 1 - Grade A</li>
                    <li>Student 2 - Grade B</li>
                    <li>Student 3 - Grade C</li>
                    <!-- Add dynamic student grade information here -->
                </ul>
            </div>
        </div>
    </div>
    
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <h3>Projects</h3>
                <p>Manage projects:</p>
                <button class="btn" onclick="location.href='add_project.jsp'">Add Project</button>
                <button class="btn" onclick="location.href='view_projects.jsp'">View Projects</button>
                <button class="btn" onclick="location.href='edit_projects.jsp'">Edit Projects</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
