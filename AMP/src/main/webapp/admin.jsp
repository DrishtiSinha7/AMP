<%-- <%@page import="Com.DB.DBConnect"%> --%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
<%@include file='all_component/all_css.jsp'%>
<style type="text/css">
.back-img {
	background: url("img/Gamja Flower (13).png");
	width: 100%;
	height: 90vh;
	background-repeat: no-repeat;
	background-size: cover;
}

</style>
</head>
<body >
	<%@include file='all_component/navbar.jsp'%>
	

	<div class="container_fluid back-img">
		<div class="text-center">
			<h1 class="text-white p-4"> APMS</h1>
		</div>
	</div>
</body>
</html>