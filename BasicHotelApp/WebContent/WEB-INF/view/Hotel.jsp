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
		List<Hotel> list = (List) request.getAttribute("list");
	%>
	<table>
		<thead>
			<tr>
				<th>Nume hotel</th>
				<th>Stele</th>
				<th>optiuni</th>
			</tr>
		</thead>
		<tbody>
			<%
				int size = list.size();
				for (int i = 0; i < size; i++) {
			%>
			<tr>
				<td><%=list.get(i).getName()%></td>
				<td><%=list.get(i).getStars()%></td>
				<td><form
						action="${pageContext.request.contextPath}/DeleteHotel"
						method="get">
						<button type="submit">Delete</button>
						<input type="number" name="idhotel"
							value="<%=list.get(i).getId()%>" hidden />
					</form>

					<form action="${pageContext.request.contextPath}/" method="get">
						<button type="submit">Edit</button>
						<input type="number" name="idhotel"
							value="<%=list.get(i).getId()%>" hidden />
					</form></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>


	<br />
	<form action="${pageContext.request.contextPath}/HotelSubmitServlet"
		method="post">

		<label>Hotel name: </label><input type="text" name="hname"
			required="required" />
		<br /> <br /> 
		<label>Stars: </label><input type="number" name="hrank" required="required" /> <br /> <br /> <br/>
		<hr />
		<label>room name</label> <input type="text" value="name" id="nameroom"
			name="nameroom" /> 
		<label>price room</label> <input type="number"
			value="10" id="price" name="priceroom" />
			
		<button type="button" onclick="addRoom()">Add Room</button>
		<br /> <br />
		<button type="submit">Submit</button>

	</form>

</body>
</html>