<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="p-3 mb-2 bg-secondary text-white col">
				<a class="text-white" href="/SpringDBApp/emp">Home Page</a>
			</div>
			<div class="p-3 mb-2 bg-secondary text-white col">
				<a class="text-white" href="/SpringDBApp/emp/addemp">Add New
					Employee</a>
			</div>
			<div class="p-3 mb-2 bg-secondary text-white col">
				<a class="text-white" href="/SpringDBApp/emp/updateemp">Update
					Employee</a>
			</div>
			<div class="p-3 mb-2 bg-secondary text-white col">
				<a class="text-white" href="/SpringDBApp/emp/searchemp">Search
					Employee</a>
			</div>
			<div class="p-3 mb-2 bg-secondary text-white col">
				<a class="text-white" href="/SpringDBApp/emp/deleteemp">Delete
					Employee</a>
			</div>
		</div>
		<form action="">
			<div class="form-group row">
				<div class="col-md-4">
					<input type="text" class="form-control" id="eno"
						placeholder="Enter eno" name="eno">
				</div>
				<div class="col-md-2">
					<button
						class="btn btn-outline-info btn-rounded btn-block my-4 waves-effect z-depth-0 "
						type="submit">Search</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>