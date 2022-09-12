<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Task || Update</h2>
		<form action="savetask" method="post"><pre>
		<input type="hidden" name="id" value="${lead.id }"/>
		Task Name  <input type="text" name="name" value="${lead.name }"/>
		Due Date   <input type="text" name="duedate"value="${lead.duedate }"/>
		Start Date <input type="text" name="startdate" value="${lead.startdate }"/>
		Priority   <input type="number" name="priority" value="${lead.priority }"/>
		Status:<select name="status" value="${lead.status }">
			  <option value="open">Open</option>
			  <option value="closed">Closed</option>
			</select>
		<input type="submit" value="update"/>	
		</pre>
		</form>
</body>
</html>