<!DOCTYPE html>
<html lang="en">
<head>
<title>Press Order Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-primary">
		<a class="navbar-brand" href="#">Xworkz</a> <a class="navbar-brand"
			href="#">About</a>
	</nav>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNav" aria-controls="navbarNav"
		aria-expanded="false" aria-label="Toggle navigation"></button>
	<h3>
		<span style="color: green;">${message1}</span>
	</h3>
	Order From: ${dto.orderFrom}
	</br> Phone Number: ${dto.phoneNo}
	</br> Card Type: ${dto.cardType}
	</br> No of Copies: ${dto.noOfCopies}
	</br> Content: ${dto.content}
	</br>

<footer style="background: blue;" class="page-footer font-small blue">
		<div class="footer-copyright text-center py-3">© 2021 Copyright</div>
	</footer>
</html>