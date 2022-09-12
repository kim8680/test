<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task List</title>
</head>
<body>
		<h2>Get all tasks</h2>
		<table><tr>
				<th>Task Id</th>
				
				<th>Task Name</th>
				
				<th>Due Date</th>
				
				<th>Start Date</th>
				
				<th>Priority</th>
					
				<th>Status</th>
				<th>Update</th>
		</tr>
		<c:forEach items="${msg }" var="lead">
				<tr>
				<td>${lead.id }</td>
				<td>${lead.name }</td>
				<td>${lead.duedate }</td>
				<td>${lead.startdate }</td>
				<td>${lead.priority }</td>
				<td>${lead.status }</td>
				<td><a href="update?id=${lead.id }">Update</a></td>
			</tr>
			</c:forEach>
		</table>
		
</body>
</html>