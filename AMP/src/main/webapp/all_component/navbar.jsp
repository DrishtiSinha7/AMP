<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


<nav class="navbar navbar-expand-lg navbar-dark bg-custom">
	<a class="navbar-brand" href="#">APMS</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp">Home
					<span class="sr-only">(current)</span>
			</a></li>
			
			<!-- <c:if test="${userobj.role eq 'admin' or userobj.role eq 'hostelAdministration'}">
                <li class="nav-item">
                    <a class="nav-link" href="addhostel.jsp">
                        <i class="fas fa-map-pin"></i> Add Project
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="ViewHostel.jsp">
                        <i class="fas fa-eye"></i> View Project
                    </a>
                </li>
            </c:if>-->
            
			

		</ul>
		
		<form class="form-inline my-2 my-lg-0">
            
                <a href="logout" class="btn btn-light mr-2">
                    <i class="fas fa-sign-out-alt"></i> Logout
                </a>

                <a href="login.jsp" class="btn btn-light mr-2">
                    <i class="fas fa-door-open"></i> Login
                </a>
                <a href="singup.jsp" class="btn btn-light">
                    <i class="fas fa-user"></i> Signup
                </a>
            
        </form>
	</div>
</nav>