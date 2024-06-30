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
							<form action="SignUpServlet" method="post">


								<div class="mb-3">
									<label class="form-label">Full Name</label> <input
										class="form-control" name="name" type="text">
								</div>

								<div class="mb-3">
									<label class="form-label">Email Address</label> <input
										class="form-control" name="email" type="email">
								</div>

								<div class="mb-3">
									<label class="form-label">Phone No.</label> <input
										class="form-control" name="phone" type="text">
								</div>

								<div class="mb-3">
									<label class="form-label">Date Of Birth </label> <input
										class="form-control" name="dob" type="date">
								</div>
								<div class="mb-3">
									<label class="form-label">Gender</label> <select required
										class="form-control" name="gender">
										<option disabled selected>---select---</option>
										<option value="Male">Male</option>
										<option value="Female">Female</option>
										<option value="Other">Other</option>
									</select>
								</div>

								<div class="mb-3">
									<label class="form-label">Blood group</label> <select required
										class="form-control" name="blood_group">
										<option disabled selected>---select---</option>
										<option value="A+">A RhD positive (A+)</option>
										<option value="A-">A RhD negative (A-)</option>
										<option value="B+">B RhD positive (B+)</option>
										<option value="B-">B RhD negative (B-)</option>
										<option value="O+">O RhD positive (O+)</option>
										<option value="O-">O RhD negative (O-)</option>
										<option value="AB+">AB RhD positive (AB+)</option>
										<option value="AB-">AB RhD negative (AB-)</option>

									</select>
								</div>

								



								<div class="mb-3">
									<label class="form-label">Address</label> <input
										class="form-control" name="address" type="text">
								</div>



								<div class="text-center pt-4">
									<button class="btn btn-success col-md-10">Sign Up</button>
								</div>


							</form>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card shadow-lg p-3 mb-5 bg-body rounded">
					<div class="card-body text-center">
					<button type="button" class="btn btn-outline-danger col-md-10">Upload Prescription</button>
					<br><br>
					<button type="button" class="btn btn-outline-success col-md-10">Diagnosis Results</button>
					</div>
				</div>

			</div>

		</div>

	</div>



</body>
</html>