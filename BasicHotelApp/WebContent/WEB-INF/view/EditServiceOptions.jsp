<%@page import="model.ServiceOption"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="model.*"%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		ServiceOption temp = (ServiceOption)request.getAttribute("temp");
	%>

	<form action="${pageContext.request.contextPath}/" method="post">
		<label>Nume</label>
		<input type="text" required="required" name="nameserviceoption" value="<%=temp.getName()%>"/>
		<br/>
		<br/>
		<label>Pozitie</label>
		<input type="number" min="1" required="required"  name="nameserviceposition" value="<%=temp.getPosition()%>"/>
		<br/>
		<br/>
		
		
		<label> Nume taxa</label> <input type="text" value="name" id="nameroom"
			name="nameroom" /> 
		<label>Taxa valoare</label> <input type="number" id="price" name="priceroom" />
			
		<button type="button" onclick="addTax()">Adauga Taxa</button>
		
		<br/>
		<br/>
		<button type="submit">Salveaza modificari </button>
		
		<input type="number" hidden  name="idserviceoption" value="<%=temp.getId()%>"/>
	
	</form>




</body>
</html>