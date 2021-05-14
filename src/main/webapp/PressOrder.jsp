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
	<nav class="navbar navbar-light" style="background-color: #e5fde3;">
		<a class="navbar-brand" href="#">Xworkz</a> 
		<a class="navbar-brand" class="float-right" href="#">About</a>
	</nav>
	
	<h4 style="color: purple;">Press Order Page</h4>
	<h6>
		<span style="color: red;">${message2}</span>
	</h6>
	<form action="order.do" method="post">
		<div class="container-fluid">
			<div class="w-50">
				<label for="orderFrom">Order From</label> <input type="text"
					class="form-control" id="orderFrom" name="orderFrom"
					placeholder="Enter your name" required="required">
			</div>
		</div>
		<div class="container-fluid">
			<div class="w-50">
				<label for="phoneNo">Phone Number</label> <input type="number"
					class="form-control" id="phoneNo" name="phoneNo"
					placeholder="Enter your Phone number" required="required">
			</div>
		</div>
		<div class="container-fluid">
			<div class="w-50">
				<label for="cardType">Select Card Type </label> <select multiple
					class="form-control" id="cardType" name="cardType" required="required">
					<option>Marriage</option>
					<option>Birthday</option>
					<option>Anniversary</option>
					<option>Thithi card</option>
					<option>House Warming Ceremony</option>
				</select>
			</div>
		</div>
		<div class="container-fluid">
			<div class="w-50">
				<label for="phoneNo">No of Copies</label> <input type="number"
					class="form-control" id="noOfCopies" name="noOfCopies"
					placeholder="Enter number of copies" required="required">
			</div>
		</div>
		<div class="container-fluid">
			<div class="w-50">
				<label for="content">Content</label>
				<textarea class="form-control" id="content" rows="2" name="content" required="required"></textarea>
			</div>
		</div>
		</br>
		</br>

		<button type="submit" class="btn btn-success btn-sm">Order</button>
		<button type="reset" class="btn btn-danger btn-sm">Reset</button></br></br>
		<a href="OrderSearch.jsp">Search</a></br>
		</form>
		<footer style="background: #e5fde3;" class="page-footer font-small black">
			<div class="footer-copyright text-center py-3">© 2021 Copyright</div>
		</footer>
	</body>
	</html>