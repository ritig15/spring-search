<!DOCTYPE html>
<html lang="en">
<head>
<title>Order Search Page</title>
</head>
<body>
	<form action="search.do" method="get">
		<pre>
Search By Order From <input type="text" name="orderFrom"> 
<input type=submit value="Search" /> <input type="reset" value="Reset" />
</pre>

	</form>
<span style="color: red;">${noRecordsFoundmessage}</span>
<span style="color: green;">${msg}</span>
</br>${dto.orderFrom}</br> 
${dto.phoneNo}</br> 
${dto.cardType}</br>
${dto.noOfCopies}</br>
${dto.content}</br>
</body>
</html>