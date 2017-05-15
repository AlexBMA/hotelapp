<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/ViewHotelServlet" method="post">
	
	<button type="submit">Go</button>
</form>

<form action="${pageContext.request.contextPath}/ViewServiceOptionServlet" method="get">
	
	<button type="submit">Go2</button>
</form>
</body>
</html>