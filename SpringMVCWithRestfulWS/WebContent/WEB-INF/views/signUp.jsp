<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/common.css">
</head>
<body>
	<h1>Registration Page</h1>
	<form action="SaveUser" class="col-lg-4 col-lg-offset-4">
		<div class="form-group">
			<label for="inputName">Name</label> <input type="text"
				class="form-control" name="name" placeholder="Name" />
		</div>
		<div class="form-group">
			<label for="inputPwd">Password</label> <input type="password"
				class="form-control" name="pwd" placeholder="Password" />
		</div>
		<div class="form-group">
			<label for="inputEmail">Email</label> <input type="text"
				class="form-control" name="email" placeholder="Email" />
		</div>
		<div class="form-group">
			<label for="inputAddr">Address</label> <input type="text"
				class="form-control" name="address" placeholder="Address" />
		</div>
		<div class="form-group">
			<label for="inputPhone">Phone</label> <input type="text"
				class="form-control" name="contact" placeholder="PhoneNo" />
		</div>
		<div class="form-group">
			<input type="submit" class="form-control" value="Submit" />
		</div>
	</form>
</body>
</html>