<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<%@include file="component/all_css_js.jsp"%>
<title>DiseaseDiagnosis</title>
</head>
<body>
	<%@include file="component/navbar.jsp"%>

	<div>

		<div>
			<div id="carouselExampleCaptions" class="carousel slide"
				data-bs-ride="carousel">
				<div class="carousel-indicators">
					<button type="button" data-bs-target="#carouselExampleCaptions"
						data-bs-slide-to="0" class="active" aria-current="true"
						aria-label="Slide 1"></button>
					<button type="button" data-bs-target="#carouselExampleCaptions"
						data-bs-slide-to="1" aria-label="Slide 2"></button>
					<button type="button" data-bs-target="#carouselExampleCaptions"
						data-bs-slide-to="2" aria-label="Slide 3"></button>
				</div>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="img/img1.jpg" class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5></h5>
							
						</div>
					</div>
					<div class="carousel-item">
						<img src="img/5.jpg" class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5></h5>
							
						</div>
					</div>
					<div class="carousel-item">
						<img src="img/img3.jpg" class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5></h5>
							
						</div>
					</div>
				</div>
				<button class="carousel-control-prev" type="button"
					data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Previous</span>
				</button>
				<button class="carousel-control-next" type="button"
					data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Next</span>
				</button>
			</div>

		</div>

		<div class="container-sm text-center pb-3">
			<a href="sign_up.jsp" type="button"
				class="btn btn-outline-success col-md-6"><i class="fa-solid fa-user-plus"></i> Get Started..</a>



		</div>

	</div>
</body>
</html>