<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding New Employee</title>
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
		
	</div>
</body>
</html>