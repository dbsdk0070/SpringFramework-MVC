<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
	#container { width: 700px; margin: 0 auto; }
	h1 { text-align: center; }
	table { border-collapse: collapse; }
	table, th, td {
		border : 1px solid black;
		margin : 0 auto;
	}
	th{
		width: 100px;
	}
</style>
</head>
<body>
<br>
<div id="container">
	<form action="login.do" method="post">
	<table>
		<tr>
			<th>id</th>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<th style="width: 100px;">pw</th>
			<td><input type="text" name="password"></td>
		</tr>
	</table>
	<p style="margin-left: 450px;"><a href="login.do">login</a></p>
	</form>
</div>


</body>
</html>