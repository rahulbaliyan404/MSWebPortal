<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 style="margin-left: 100px; color: blue;">This is login related
		page, which is using devtools.</h1>

	<form action="/save" method="post"
		style="margin-left: 300px">

		<table border="1">

			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>

		</table>

	</form>

</body>
</html>