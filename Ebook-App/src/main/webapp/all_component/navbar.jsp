<%-- Добавленная часть  --%>
<%-- Код переписанный на чистый html css добавленной части - N1--%>
<style>
	a:hover {
		text-decoration: none;
	}
</style>
<div class="container=fluid"
	style="height: 10px; background-color: #303f9f"></div>
<div class="container-fluid p-3">
	<div class="row">
		<div class="col-md-3">
			<h3 class="text-success">
				<a href="index.jsp" class="text-success"><i class="fa-solid fa-book"></i> Ebooks</a>
			</h3>
	    <button id="lang-en">English</button>
	    <button id="lang-ru">Russian</button>
		</div>
		<div class="col-md-3">
			<a href="login.jsp" class="btn btn-success">Login</a> <a href="register.jsp"
				class="btn btn-primary">Register</a>
		</div>
	</div>
</div>

<%-- Взято полностью из bootstrap--%>
<nav class="navbar navbar-expand-lg navbar-dark bg-custom">
	<a class="navbar-brand" href="#"><i class="fa-solid fa-house"></i></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">Home<span
					class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link" href="#"><i
					class="fas fa-book-open"></i> Recent Book</a></li>
			<li class="nav-item active"><a class="nav-link" href="#"><i
					class="fas fa-book-open"></i> New Book</a></li>

			<li class="nav-item active"><a class="nav-link disabled"
				href="#"><i class="fas fa-book-open"></i> Old Book</a></li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
			<button class="btn btn-light my-2 my-sm-0 ml-1" type="submit">
				<i class="fas fa-cog"></i>Setting
			</button>
			<button class="btn btn-light my-2 my-sm-0 ml-1" type="submit">
				<i class="fas fa-phone-square-alt"></i> Contact Us
			</button>
		</form>
	</div>
</nav>