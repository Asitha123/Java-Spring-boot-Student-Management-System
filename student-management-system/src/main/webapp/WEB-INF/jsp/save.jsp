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
			<h1>New Student</h1>
			<form method="post">
				
				<input type="hidden" name="id" value="${student.id}" />
				
				<div class="input-group">
					<span class="input-group-addon" id="name">Name</span>
					<input 
						class="form-control" 
						placeholder="name" 
						type="text" 
						name="name" 
						id="name"
						value="${student.name}"
						required/>
				</div>
				
				<div class="input-group">
					<span class="input-group-addon" id="name">Sid</span>
					<input 
						class="form-control" 
						placeholder="sid" 
						type="number" 
						name="sid" 
						id="sid"
						value="${student.sid}"
						required/>
				</div>
				
				<div class="input-group">
					<span class="input-group-addon" id="gender">Gender</span>
					<select 
						name="gender"
						id="gender"
						class="form-control"
						required >
						
						<c:forEach items="${genderList}" var="gender">
					         <option value="${gender}">${gender}</option>
					    </c:forEach>
					    
					</select>
				</div>
				
				<div class="input-group">
					<span class="input-group-addon" id="address">Address</span>
					<input 
						class="form-control" 
						placeholder="address" 
						type="text" 
						name="address" 
						id="address"
						value="${student.address}"
						multiple="multiple"
						required/>
				</div>
				
				<div class="input-group">
					<span class="input-group-addon" id="contactNo">Contact No</span>
					<input 
						class="form-control" 
						placeholder="contactNo" 
						type="text" 
						name="contactNo" 
						id="contactNo"
						value="${student.contactNo}"
						required/>
				</div>
				
				<input type="submit" value="save" class="btn btn-default"/>
				
			</form>
		</div>

	</div>

	<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>