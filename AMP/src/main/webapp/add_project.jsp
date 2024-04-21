
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Project</title>
<%@include file="all_component/all_css.jsp"%>
</head>
<body style="background-color: #B5CB99">
	
	<%@include file="all_component/navbar.jsp"%>

	<div class="container p-2">
		<div class="col-md-10 offset-md-1">
			<div class="card">
				<div class="card-body">
					<div class="text-center text-success">
						<i class="fas fa-user-friends fa-3x"></i>

						

						<h5>Add Project</h5>
					</div>
					<form action="add_hostel" method="post" enctype="multipart/form-data">
						<div class="form-group">
							<label>Project Name</label> <input type="text" name="title"
								required class="form-control">
						</div>
					
						<div class="form-row">
							
							<div class="form-group col-md-4">
								<label>Category</label> <select class="custom-select"
									id="inlineFromCustomerSelectPref" name="category">
									<option selected>Choose...</option>
									<option value="Girls Hostel">cat1</option>
									<option value="Boys Hostel">cat2</option>
									<option value="Flates">cat3</option>
									<option value="PG">cat4</option>
								</select>
							</div>
							<div class="form-group col-md-4">
								<label>Status</label> <select class="form-control"
									name="Rooms available">
									<option class="active" value="available">Active</option>
									<option class="Inactive" value="Inavailable">Inactive</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label>Enter Description</label>
							<textarea required rows="6" cols="" name="desc"
								class="form-control"></textarea>
						</div>
						<button class="btn btn-success">Post Project</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>