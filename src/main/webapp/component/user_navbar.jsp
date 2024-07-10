<nav class="navbar navbar-expand-lg navbar-dark bg-success">
	<div class="container-fluid">
		<a class="navbar-brand" href="index.jsp"><i
			class="fa-solid fa-hand-holding-medical"></i> Prescription Scanning</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="user_home.jsp"><i
						class="fa-solid fa-house-medical"></i> Home</a></li>


				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="upload1.jsp"><i
						class="fa-solid fa-right-to-bracket"></i> Upload</a></li>


				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="result.jsp"><i
						class="fa-solid fa-user-plus"></i> Results</a></li>


				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="LogOutServlet"><i
						class="fa-solid fa-right-from-bracket fa-flip-horizontal"></i> Log
						Out</a></li>

				
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#"><i class="fa-solid fa-user"></i> ${userObj.name}</a></li>

				


			</ul>

		</div>
	</div>
</nav>