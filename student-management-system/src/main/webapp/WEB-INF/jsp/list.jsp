<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Student Management System</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/">Home</a></li>
					<li><a href="/save">New Student</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<h1>Students</h1>
			<div class="panel panel-default">
			  
		  	<!-- Table -->
		  	<table class="table">
		    	<thead>
		    		<tr>
		    			<td>Name</td>
		    			<td>Sid</td>
		    			<td>Gender</td>
		    			<td>Address</td>
		    			<td>Contact No</td>
		    			<td>Action</td>
		    		</tr>
		    	</thead>
		    	<tbody>
		    		
		    		<c:forEach items="${students}" var="student">
		    			<tr>
							<th>${student.name}</th>
							<th>${student.sid}</th>
							<th>${student.gender}</th>
							<th>${student.address}</th>
							<th>${student.contactNo}</th>
							<th >
								<div class="btn-group">
								  <button
								  	id="${student.id}" 
								  	style="width: 70px" 
								  	type="button" 
								  	class="btn btn-success"
								  	onclick="window.location='/save?q=${student.id}'">Edit</button>
								  <form action="/delete" onsubmit="return confirm('Are you sure delete!')">
								  	<input type="hidden" name="id" value="${student.id}" />
								  	<button style="width: 70px" type="submit" class="btn btn-danger">Delete</button>
								  </form>
								</div>
							</th>
						</tr>
					</c:forEach>
		    		
		    	</tbody>
		  	</table>
			</div>
		</div>

	</div>

	<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>