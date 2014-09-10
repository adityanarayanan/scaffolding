<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="">
		<meta name="author" content="">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Project Home</title>
		
		<!-- Bootstrap core for CSS -->
		<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" />
	</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div class="navbar-collapse collapse">
				<form class="navbar-form navbar-right" role="form">
					<div class="form-group">
						<input type="text" placeholder="Email" class="form-control">
					</div>
					<div class="form-group">
						<input type="password" placeholder="Password" class="form-control">
					</div>
					<button type="submit" class="btn btn-success">Sign in</button>
				</form>
			</div>
			<!--/.navbar-collapse -->
		</div>
	</div>
	
	<!-- Main container for page content -->
	<div class="jumbotron">
		<div class="container">
			<h1>Welcome to Project!</h1>
			<p>This is the welcome page.</p>
			<p>${ message }</p>
		</div>
		<footer>
			<p>&copy; Company 2014</p>
		</footer>
	</div>
	
	<!-- Load JQuery -->
	<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
	<!-- Bootstrap core JavaScript -->
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<!-- Page specific JavaScript -->
	<script src="<c:url value="/resources/js/views/index.js" />"></script>
</body>
</html>