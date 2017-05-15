<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="${pageContext.request.contextPath}/resources/js/script.js"
	type="application/javascript"></script>
<title>Insert title here</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>Nume </th>
				<th>Positie </th>
				<th> </th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>

	<br/>
	<form action="" method="post">
		<input type="text" required="required" name="nameserviceoption" />
		<input type="number" min="1" required="required"  name="nameserviceposition"/>
		
		<button type="submit">Adauga optine </button>
	
	</form>
</body>
</html>