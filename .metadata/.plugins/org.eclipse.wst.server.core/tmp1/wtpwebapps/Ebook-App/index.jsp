<%@ page import="java.sql.Connection" %>
<%@ page import="com.db.DbConnect" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ebook</title>
<%@include file="all_component/allCss.jsp"%>
<style type="text/css">
.back-img {
	background: url("img/back_img.jpg");
	height: 50vh;
	width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}

.crd-ho:hover {
	background-color: #fcf7f7;
}
</style>
</head>
<body>
	<div class="main-container">
		<%@include file="all_component/navbar.jsp"%>
		<div class="container-fluid back-img">
			<h2 class="text-center" id="lang-ebook-system">EBook Managment System</h2>
		</div>


		<!-- Start Recent Book -->
		<div class="container">
			<h3 class="text-center" id="lang-recent-book">Recent Book</h3>
			<div class="row">
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="" src="book/book1.jpg"
								style="width: 150px; height: 200px;" class="img-thumblin">
							<p id="lang-name1">Name 1</p>
							<p id="lang-author1">Author 1</p>
							<p id="lang-category1">Categories: New</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm ml-2" id="lang-add-cart"><i
									class="fas fa-cart-plus"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm ml-1" id="lang-view-details">View Details</a> <a href=""
									class="btn btn-danger btn-sm ml-1">299</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="" src="book/book2.jpg"
								style="width: 150px; height: 200px;" class="img-thumblin">
							<p id="lang-name2">Name 2</p>
							<p id="lang-author2">Author 2</p>
							<p id="lang-category2">Categories: New</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm ml-2" id="lang-add-cart"><i
									class="fas fa-cart-plus"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm ml-1" id="lang-view-details">View Details</a> <a href=""
									class="btn btn-danger btn-sm ml-1">299</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="" src="book/book3.jpg"
								style="width: 150px; height: 200px;" class="img-thumblin">
							<p id="lang-name3">Name 3</p>
							<p id="lang-author3">Author 3</p>
							<p id="lang-category3">Categories: Old</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm ml-2" id="lang-add-cart"><i
									class="fas fa-cart-plus"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm ml-1" id="lang-view-details">View Details</a> <a href=""
									class="btn btn-danger btn-sm ml-1">299</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="" src="book/book4.jpg"
								style="width: 150px; height: 200px;" class="img-thumblin">
							<p id="lang-name3">Name3</p>
							<p id="lang-author3">Author</p>
							<p class="lang-category3">Categories: Old</p>
							<div id="row">
								<a href="" class="btn btn-danger btn-sm ml-2" id="lang-add-cart"><i
									class="fas fa-cart-plus"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm ml-1" id="lang-view-details">View Details</a> <a href=""
									class="btn btn-danger btn-sm ml-1">299</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="text-center mt-2">
				<a href="" class="btn btn-danger btn-sm text-white" id="lang-view-all">View All</a>
			</div>
		</div>
		<!-- End Recent Book  -->

		<!--<div style="height: 1px; width: 1080px; background-color: #f7f7f7; margin: 20px 20px"></div> -->
		<hr>

		<!-- Start New Book -->
		<div class="container">
			<h3 class="text-center" id="lang-new-book">New Book</h3>
			<div class="row">
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="" src="book/book1.jpg"
								style="width: 150px; height: 200px;" class="img-thumblin">
							<p id="lang-name1">Name1</p>
							<p id="lang-author1">Author</p>
							<p id="lang-category1">Categories: New</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm ml-2" id="lang-add-cart"><i
									class="fas fa-cart-plus"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm ml-1" id="lang-view-details">View Details</a> <a href=""
									class="btn btn-danger btn-sm ml-1">299</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="" src="book/book2.jpg"
								style="width: 150px; height: 200px;" class="img-thumblin">
							<p id="lang-name2">Name2</p>
							<p id="lang-author2">Author</p>
							<p id="lang-category2">Categories: New</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm ml-2" id="lang-add-cart"><i
									class="fas fa-cart-plus"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm ml-1" id="lang-view-details">View Details</a> <a href=""
									class="btn btn-danger btn-sm ml-1">299</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="" src="book/book3.jpg"
								style="width: 150px; height: 200px;" class="img-thumblin">
							<p id="lang-name3">Name3</p>
							<p id="lang-author3">Author</p>
							<p id="lang-category3">Categories: Old</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm ml-2" id="lang-add-cart"><i
									class="fas fa-cart-plus"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm ml-1" id="lang-view-details">View Details</a> <a href=""
									class="btn btn-danger btn-sm ml-1">299</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="" src="book/book4.jpg"
								style="width: 150px; height: 200px;" class="img-thumblin">
							<p id="lang-name3">Name3</p>
							<p id="lang-author3">Author</p>
							<p id="lang-category3">Categories: New</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm ml-2" id="lang-add-cart"><i
									class="fas fa-cart-plus"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm ml-1" id="lang-view-details">View Details</a> <a href=""
									class="btn btn-danger btn-sm ml-1">299</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="text-center mt-2">
				<a href="" class="btn btn-danger btn-sm text-white" id="lang-view-all">View All</a>
			</div>
		</div>
		<!-- End New Book  -->

		<hr>

	</div>
	<jsp:include page="all_component/footer_main.jsp"/>
	<jsp:include page="all_component/script.jsp"/>
	
</body>
</html>