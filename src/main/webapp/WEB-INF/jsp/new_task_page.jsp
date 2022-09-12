<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task Page</title>
</head>
<body>
<h2>Task  |  Details</h2>
		<form action="save" method="post"><pre>
		Task Id  <input type="number" name="id"/>
		Task Name  <input type="text" name="name"/>
		Due Date   <input type="text" name="duedate"/>
		Start Date <input type="text" name="startdate"/>
		Priority   <input type="number" name="priority"/>
		Status:<select name="status">
			  <option value="open">Open</option>
			  <option value="closed">Closed</option>
			</select>
		<input type="submit" value="save"/>	
		</pre>
		</form>
		
</body>
</html>