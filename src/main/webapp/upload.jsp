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
	<%@include file="component/user_navbar.jsp"%>

	<%-- Check if userObj is available in the session --%>
	<c:if test="${not empty userObj}">

		<button type="button" class="btn btn-outline-light">User Id:
			${userObj.userId}</button>

	</c:if>

	<%-- Display a message if studentObj is not found in the session --%>
	<c:if test="${empty userObj}">
		<c:redirect url="log_in.jsp"></c:redirect>
	</c:if>

	<div class="container my-3 py-3">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card shadow-lg p-3 mb-5 bg-body rounded">
					<div class="card-header">
						<p class="text-center fs-1">Upload Prescription</p>

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
						<form action="UploadServlet" method="post" enctype="multipart/form-data">


							<div class="row g-3">
								<p class="fs-3">General Information:</p>
								<div class="col-md-6">
									<label class="form-label">Full Name</label> <input
										class="form-control" name="name" type="text"
										value="${userObj.name}">
								</div>

								<input class="form-control" name="userId" type="hidden"
									value="${userObj.userId}" >


								<div class="col-md-6">
									<label class="form-label">Date of Birth</label> <input
										class="form-control" name="dob" type="text"
										value="${userObj.dob}">
								</div>


								<div class="col-md-6">
									<label class="form-label">Gender </label> <input
										class="form-control" name="gender" type="text"
										value="${userObj.gender}">
								</div>
								<div class="col-md-6">
									<label class="form-label">Blood Group </label> <input
										class="form-control" name="blood_group" type="text"
										value="${userObj.bloodGroup}">
								</div>

								<hr>
								<p class="fs-3">Medical History:</p>


								<div class="col-md-6">
									<label class="form-label">Taking any medication?</label>
									<div class="form-check form-check-inline">
										<input class="form-check-input" type="radio"
											name="taking_medication" id="inlineRadio1" value="Yes">
										<label class="form-check-label" for="inlineRadio1">Yes</label>
									</div>
									<div class="form-check form-check-inline">
										<input class="form-check-input" type="radio"
											name="taking_medication" id="inlineRadio2" value="No">
										<label class="form-check-label" for="inlineRadio2">No</label>
									</div>

								</div>

								<div class="col-md-12">
									<input class="form-control" name="medication" type="text"
										placeholder="If Yes list here.. eg.:Ibuprofen, Moxicillin,  Fluoxetine">
								</div>

								<div class="col-md-12">
									<label class="form-label">Any Symptoms?</label> <br>
									<div class="form-check form-check-inline">
										<input name="symptoms1" class="form-check-input"
											type="checkbox" id="inlineCheckbox1"
											value="Increased Thirst and Frequent Urination"> <label
											class="form-check-label" for="inlineCheckbox1">Increased
											Thirst and Frequent Urination</label>
									</div>
									<div class="form-check form-check-inline">
										<input name="symptoms2" class="form-check-input"
											type="checkbox" id="inlineCheckbox2" value="Increased Hunger">
										<label class="form-check-label" for="inlineCheckbox2">Increased
											Hunger</label>
									</div>
									<div class="form-check form-check-inline">
										<input name="symptoms3" class="form-check-input"
											type="checkbox" id="inlineCheckbox3"
											value="Pain in the Breast"> <label
											class="form-check-label" for="inlineCheckbox3">Pain
											in the Breast</label>
									</div>


									<div class="form-check form-check-inline">
										<input name="symptoms4" name="symptoms4"
											class="form-check-input" type="checkbox" id="inlineCheckbox1"
											value="Lump in the Breast or Underarm"> <label
											class="form-check-label" for="inlineCheckbox1">Lump
											in the Breast or Underarm</label>
									</div>
									<div class="form-check form-check-inline">
										<input name="symptoms5" class="form-check-input"
											type="checkbox" id="inlineCheckbox2"
											value="Shaking or trembling"> <label
											class="form-check-label" for="inlineCheckbox2">Shaking
											or trembling</label>
									</div>
									<div class="form-check form-check-inline">
										<input name="symptoms6" class="form-check-input"
											type="checkbox" id="inlineCheckbox3" value="Muscle Stiffness">
										<label class="form-check-label" for="inlineCheckbox3">Muscle
											Stiffness</label>
									</div>


								</div>

								<div class="input-group mb-3">
									<input type="file" class="form-control" name="image">
									<label class="input-group-text" for="inputGroupFile02">Upload
										Prescription</label>
								</div>


								<div class="mb-3">
									<label class="form-label">Diagnose for</label> <select required
										class="form-control" name="diagnose">
										<option disabled selected>---select---</option>
										<option value="Breast Cancer">Breast Cancer</option>
										<option value="Diabetes">Diabetes</option>
										<option value="Heart Disease">Heart Disease</option>
										<option value="Parkinson's Disease">Parkinson's
											Disease</option>
									</select>
								</div>


							</div>



							<div class="text-center pt-4">
								<button value="reset" type="reset"
									class="btn btn-outline-secondary col-md-5">
									<i class="fa-solid fa-arrow-rotate-right fa-flip-horizontal"></i>
									Reset
								</button>

								<button value="submit" type="submit"
									class="btn btn-success col-md-5">
									<i class="fa-solid fa-file-arrow-up"></i> Upload
								</button>
							</div>


						</form>
					</div>
				</div>
			</div>
		</div>

	</div>




</body>
</html>