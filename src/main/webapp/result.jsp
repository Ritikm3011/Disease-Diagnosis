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


	<%
	User user = ((User) session.getAttribute("userObj"));
	int userId = user.getUserId();
	UserDao dao = new UserDao(FactoryProvider.getSessionFactory());
	List<Result> resultList = dao.getResult(userId);
	%>






	<div class="container my-3 py-3">
		<div class="row">
			<div class="col-md-12 ">
				<div class="card shadow-lg p-3 mb-5 bg-body rounded">
					<div class="card-header">
						<p class="text-center fs-1">Diagnostic Results</p>

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






						<div class="card-body  text-secondary">

							<table class="table table-hover">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">Name</th>
										<th scope="col">Date & Time</th>
										<th scope="col">Diagnose for</th>
										<th scope="col">Result</th>
									</tr>
								</thead>
								<tbody>

									<%
									int i = 0;
									for (Result result : resultList) {
										i++;
									%>

									<tr>
										<th scope="row"><%=i%></th>
										<td><%=result.getName()%></td>
										<td><%=result.getDateTime()%></td>
										<td><%=result.getDiagnose()%></td>
										<td><%=result.getResult()%></td>
										
									</tr>

									<%
									}
									%>
								</tbody>
							</table>

						</div>






					

					</div>
				</div>
			</div>
		</div>

	</div>




</body>
</html>