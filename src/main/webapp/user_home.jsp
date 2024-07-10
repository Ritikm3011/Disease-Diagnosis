<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="component/all_css_js.jsp"%>
<title>User Home</title>
</head>
<body>
	<%@include file="component/user_navbar.jsp"%>


<%-- Check if userObj is available in the session --%>
	<c:if test="${not empty userObj}">
		
		<button type="button" class="btn btn-outline-light">User Id: ${userObj.userId}</button>

	</c:if>

	<%-- Display a message if studentObj is not found in the session --%>
	<c:if test="${empty userObj}">
		<c:redirect url="log_in.jsp"></c:redirect>
	</c:if>


	<div class="container my-3 py-3">
		<div class="row">
			<div class="col-md-8 ">
				<div class="card shadow-lg p-3 mb-5 bg-body rounded">

					<div class="card-header text-center">

						<h1>
							<i class="fa-solid fa-circle-user fa-2xl"></i>
						</h1>

					</div>

					<div class="card-body">
						<div class="card-body">
							<form action="#" method="post">


								<div class="mb-3">
									<label class="form-label">Full Name</label> <input
										class="form-control" name="name"  type="text" disabled placeholder="${userObj.name}">
								</div>

								<div class="mb-3">
									<label class="form-label">Email Address</label> <input
										class="form-control" name="email" type="email" disabled placeholder="${userObj.email}"> 
								</div>

								<div class="mb-3">
									<label class="form-label">Phone No.</label> <input
										class="form-control" name="phone" type="text" disabled placeholder="${userObj.phone}">
								</div>

								<div class="mb-3">
									<label class="form-label">Date Of Birth </label> <input
										class="form-control" name="dob" type="text" disabled placeholder="${userObj.dob}">
								</div>
								<div class="mb-3">
									<label class="form-label">Gender </label> <input
										class="form-control" name="gender" type="text" disabled placeholder="${userObj.gender}">
								</div>
								<div class="mb-3">
									<label class="form-label">Blood Group </label> <input
										class="form-control" name="gender" type="text" disabled placeholder="${userObj.bloodGroup}">
								</div>

				

								



								<div class="mb-3">
									<label class="form-label">Address</label> <input
										class="form-control" name="address" type="text" disabled placeholder="${userObj.address}">
								</div>



								


							</form>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card shadow-lg p-3 mb-5 bg-body rounded">
					<div class="card-body text-center">
					<a href="upload1.jsp" type="button" class="btn btn-outline-danger col-md-10"><i class="fa-solid fa-upload fa-beat"></i> Upload Prescription</a>
					<br><br>
					<a href="result.jsp" type="button" class="btn btn-outline-success col-md-10"><i class="fa-solid fa-stethoscope"></i> Scanned Results</a>
					</div>
				</div>

			</div>

		</div>

	</div>



</body>
</html>