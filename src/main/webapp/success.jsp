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

<style>
#loader {
	
}

#content {
	display: none;
}
</style>


</head>
<body>

	<%
	int pId = Integer.parseInt(request.getParameter("prescriptionId"));
	%>

	<%@include file="component/user_navbar.jsp"%>

	<%-- Check if userObj is available in the session --%>
	<c:if test="${not empty userObj}">

		<button type="button" class="btn btn-outline-light">User Id:
			${userObj.userId}</button>
		<button type="button" class="btn btn-outline-light">
			Prescription Id:
			<%=pId%></button>




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
						<p class="text-center fs-3">Please wait.. Your Prescription is
							being Scanned..</p>



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


						<div class="d-flex justify-content-center">
							<div id="loader" class="spinner-border text-danger "
								role="status" style="width: 3rem; height: 3rem;">
								<span class="visually-hidden">Loading...</span>
							</div>
						</div>

						<div id="content">
							<!-- Your actual content goes here -->
							<div class="text-center p-2">
								<a href="user_home.jsp" type="button"
									class="btn btn-primary col-md-5">Go to Home</a> <a
									href="view_scanned_result.jsp?prescriptionId=<%=pId%>"
									type="button" class="btn btn-outline-success col-md-5"><i
									class="fa-solid fa-stethoscope"></i> View Scanned Results</a>

							</div>
						</div>



					</div>



				</div>
			</div>
		</div>

	</div>


	<script>
		document.addEventListener("DOMContentLoaded", function() {
			setTimeout(function() {
				document.getElementById("loader").style.display = "none";
				document.getElementById("content").style.display = "block";
			}, 5000); // Change 3000 to the number of milliseconds you want the loader to run
		});
	</script>

</body>
</html>