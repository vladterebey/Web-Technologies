<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.entity.BookDtls"%>
<%@ page import="com.dao.BookDao"%>
<%@ page import="com.dao.BookDaoImpl"%>
<%@ page import="com.db.DbConnect"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin: Add Books</title>
<%@include file="allCss.jsp"%>
</head>
<body>
	<%@include file="navbar.jsp"%>

	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Edit Books</h4>
						
						<c:if test="${not empty succMsg}">
							<p class="text-center text-success">${succMsg}</p>
							<c:remove var="succMsg" scope="session"/>
						</c:if>
						
						<c:if test="${not empty failedMsg}">
							<p class="text-center text-danger">${failedMsg}</p>
							<c:remove var="failedMsg" scope="session"/>
						</c:if>
						
						
						<%
							int id=Integer.parseInt(request.getParameter("id"));
							BookDaoImpl dao = new BookDaoImpl(DbConnect.getConn());
							BookDtls b = dao.getBookById(id);
						%>
						
						
						<form action="../edit_books" method="post">
							<input type="hidden" name="id" value="<%=b.getBookId()%>">
							<div class="form-group">
								<label for="exampleInputEmail">Book Name</label> <input
									name="bname" type="text" class="form-control"
									id="exampleImputEmail" aria-describedby="emailHelp"
									value="<%=b.getBookName()%>">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail">Author Name</label> <input
									name="author" type="text" class="form-control"
									id="exampleImputEmail" aria-describedby="emailHelp"
									value="<%=b.getAuthor()%>">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail">Price</label> <input name="price"
									type="number" class="form-control" id="exampleImputEmail"
									value="<%=b.getPrice()%>">
							</div>
							<div class="form-group">
								<label for="inputState">Book Status</label> <select
									id="inputState" name="bstatus" class="form-control">
									
									<% if ("Active".equals(b.getStatus())) {
									%>
										<option value="Active">Active</option>
										<option value="Inactive">Inactive</option>
									<%
									} else {
									%>
									<option value="Inactive">Inactive</option>
									<option value="Active">Active</option>
									<%}
									%>
								</select>
							</div>
							<button type="submit" class="btn btn-primary">Update</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%-- <div style="margin-top: 50px;"><%@include file="footer.jsp" %></div> --%>
</body>
</html>