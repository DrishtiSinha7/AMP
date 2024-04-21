<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Dashboard</title>
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
    <h2>Welcome to Student Dashboard</h2>
    <div class="row">
        <div class="col-md-6">
    <div class="card">
        <h3>Available Projects</h3>
        <p>Projects added by teachers:</p>
        <ul>
            <li>
                Project 1 - Teacher A
                <form action="view_project" method="post" style="display: inline;">
                    <input type="hidden" name="projectId" value="1">
                    <button type="submit" class="btn btn-primary">View</button>
                </form>
                <form action="apply_project" method="post" style="display: inline;">
                    <input type="hidden" name="projectId" value="1">
                    <button type="submit" class="btn btn-success">Apply</button>
                </form>
            </li>
            <!-- Add more dynamic project list items here -->
        </ul>
    </div>
</div>
        <div class="col-md-6">
            <div class="card">
                <h3>Your Projects</h3>
                <p>Add your own projects:</p>
                <form action="add_project" method="post">
                    <div class="form-group">
                        <label for="projectName">Project Name</label>
                        <input type="text" class="form-control" id="projectName" name="projectName" required>
                    </div>
                    <div class="form-group">
                        <label for="projectDescription">Project Description</label>
                        <textarea class="form-control" id="projectDescription" name="projectDescription" rows="3" required></textarea>
                    </div>
                    <button type="submit" class="btn">Add Project</button>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
