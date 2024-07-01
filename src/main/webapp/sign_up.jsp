<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="component/all_css_js.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<%@include file="component/navbar.jsp"%>

	<div class="container my-3 py-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card shadow-lg p-3 mb-5 bg-body rounded">
					<div class="card-header">
						<p class="text-center fs-1">Sign Up</p>

						<c:if test="${not empty successMsg}">
							<p class="text-center text-success ">${successMsg}</p>
							<c:remove var="successMsg" scope="session" />
						</c:if>

						<c:if test="${not empty failMsg}">
							<p class="text-center text-danger ">${failMsg}</p>
							<c:remove var="failMsg" scope="session" />
						</c:if>
					</div>

					<div class="card-body">
						<form action="SignUpServlet" method="post">


							<div class="mb-3">
								<label class="form-label">Full Name</label> <input
									class="form-control" name="name" type="text" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Email Address</label> <input
									class="form-control" name="email" type="email" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Phone No.</label> <input
									class="form-control" name="phone" type="text" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Date Of Birth </label> <input
									class="form-control" name="dob" type="date" required>
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
									<option value="A RhD positive (A+)">A RhD positive
										(A+)</option>
									<option value="A RhD negative (A-)">A RhD negative
										(A-)</option>
									<option value="B RhD positive (B+)">B RhD positive
										(B+)</option>
									<option value="B RhD negative (B-)">B RhD negative
										(B-)</option>
									<option value="O RhD positive (O+)">O RhD positive
										(O+)</option>
									<option value="O RhD negative (O-)">O RhD negative
										(O-)</option>
									<option value="AB RhD positive (AB+)">AB RhD positive
										(AB+)</option>
									<option value="AB RhD negative (AB-)">AB RhD negative
										(AB-)</option>

								</select>
							</div>

							<div class="mb-3">
								<label class="form-label">Password</label> <input
									class="form-control" name="password" type="password" required>
							</div>



							<div class="mb-3">
								<label class="form-label">Address</label> <input
									class="form-control" name="address" type="text" required>
							</div>



							<div class="text-center pt-4">
								<button class="btn btn-success col-md-10">Sign Up</button>
							</div>
							<div class="text-center mt-2">
								Already have account? <a href="log_in.jsp"
									class="text-decoration-none">log in</a>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>

	</div>

</body>
</html>