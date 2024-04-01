<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Page</title>
<%@include file="all_component/all_css.jsp"%>
</head>
<style>
.btn.btn-primary {
    background-color: #186F65;
    margin-top: 20px;
}
</style>
<body style="background-color: #B5CB99">
    <%@include file="all_component/navbar.jsp"%>

    <div class="container-fluid">
        <div class="row p-5">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <div class="text-center">
                            <i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
                            <h5>Registration For Student</h5>
                        </div>
                        
                        <form action="register_student" method="post">
                            <div class="from-group">
                                <label>Enter Full Name</label>
                                <input type="text" required="required" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name">
                            </div>

                            <div class="from-group">
                                <label>Enter Email</label>
                                <input type="email" required="required" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
                            </div>

                            <div class="from-group">
                                <label for="exampleInputPassword1">Enter Password</label>
                                <input required="required" type="password" class="form-control" id="exampleInputPassword1" name="ps">
                            </div>

                            <button type="submit" class="btn btn-primary badge-pill btn-block">Register</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <div class="text-center">
                            <i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
                            <h5>Registration For Faculty</h5>
                        </div>
                        
                        <form action="register_faculty" method="post">
                            <div class="from-group">
                                <label>Enter Full Name</label>
                                <input type="text" required="required" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp" name="name">
                            </div>

                            <div class="from-group">
                                <label>Enter Email</label>
                                <input type="email" required="required" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp" name="email">
                            </div>

                            <div class="from-group">
                                <label for="exampleInputPassword2">Enter Password</label>
                                <input required="required" type="password" class="form-control" id="exampleInputPassword2" name="ps">
                            </div>

                            <button type="submit" class="btn btn-primary badge-pill btn-block">Register</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
