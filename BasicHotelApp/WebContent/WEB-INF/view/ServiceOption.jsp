<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*"%>
<%@ page import="model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="${pageContext.request.contextPath}/resources/js/script.js"
	type="application/javascript"></script>
<title>Insert title here</title>
</head>
<body>

	<%
		List<ServiceOption> list = (List<ServiceOption>)request.getAttribute("listS");
	%>
	<table>
		<thead>
			<tr>
				<th>Nume </th>
				<th>Positie </th>
				<th>Optiuni </th>
			</tr>
		</thead>
		<tbody>
			<%
				for(int i=0;i<list.size();i++)
				{
			 %>
				<tr>
					<td><%=list.get(i).getName() %></td>
					<td><%=list.get(i).getPosition() %></td>
					<td>
						<form action="${pageContext.request.contextPath}/ViewEditServiceOperationServlet" method="get" >
							
							<button type="submit">Modfica</button>
							<input type="number" name="idservice" value="<%=list.get(i).getId()%>" hidden/>
						</form>
					
					</td>
				</tr>
						
			<%	}
			%>
		</tbody>
	</table>

	<br/>
	<form action="${pageContext.request.contextPath}/AddServiceOption" method="post">
		<label>Nume</label>
		<input type="text" required="required" name="nameserviceoption" />
		<br/>
		<br/>
		<label>Pozitie</label>
		<input type="number" min="1" required="required"  name="nameserviceposition"/>
		<br/>
		<br/>
		<button type="submit">Adauga optine </button>
	
	</form>
</body>
</html>