<%@page import="com.entity.PrescriptionData"%>
<%@page import="com.entity.Result"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.User"%>
<%@page import="com.db.FactoryProvider"%>
<%@page import="com.dao.UserDao"%>
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


<%
int pId = Integer.parseInt(request.getParameter("prescriptionId"));
%>

</head>
<body>
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


	<%
	User user = ((User) session.getAttribute("userObj"));
	int userId = user.getUserId();
	UserDao dao = new UserDao(FactoryProvider.getSessionFactory());
	PrescriptionData pData = dao.getScannedData(pId);
	%>






	<div class="container my-3 py-3">
		<div class="row">
			<div class="col-md-12 ">
				<div class="card shadow-lg p-3 mb-5 bg-body rounded">
					<div class="card-header">
						<p class="text-center fs-1">Scanned Results</p>

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


						<p>
							Date&Time:
							<%=pData.getUploadDateTime()%></p>


						<form action="UpdateServlet" method="post">





							<input class="form-control" name="userId" type="hidden"
								value="${userObj.userId}"> <input class="form-control"
								name="name" type="hidden" value="${userObj.name}"> <input
								class="form-control" name="prescriptionId" type="hidden"
								value="<%=pId%>">




							<div class="form-floating">
								<textarea class="form-control" name="data"
									id="floatingTextarea2" style="height: 600px"><%=pData.getPrescriptionData()%></textarea>

							</div>




							<div class="text-center pt-4">
								<button value="reset" type="reset"
									class="btn btn-outline-secondary col-md-4">
									<i class="fa-solid fa-arrow-rotate-right fa-flip-horizontal"></i>
									Reset
								</button>

								<button value="submit" type="submit"
									class="btn btn-success col-md-4">
									<i class="fa-solid fa-file-arrow-up"></i> Save
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