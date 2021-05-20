<%@page contentType="text/html"
        pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<html>
<head>
<title>Display All Page</title>
</head>
<body>
${displayAllMsg}
${noRecordsFoundmsg}
	<form action="displayAll.do" method="get">
		<table border="1">

<thead>
<tr>
<th>Order From</th>
<th>Phone Number</th>
<th>Number of Copies</th>
<th>Card Type</th>
<th>Content</th>
</tr>
</thead>
<tbody>
<c:forEach items="${Listdto}" var="dto"> 
<tr>
<td><c:out value="${dto.orderFrom}"/></td>
<td><c:out value="${dto.phoneNo}"/></td>
<td><c:out value="${dto.noOfCopies}"/></td>
<td><c:out value="${dto.cardType}"/></td>
<td><c:out value="${dto.content}"/></td>
</tr>
</c:forEach>
</tbody>
		</table>
		</form>
</body>
</html>