<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<script type="text/javascript" src="js/main.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<table>
			<tr>
				<img src="images/logo.jpg" />
			</tr>
			<center>${message}</center>
			<form:form id="loginForm" method="post" action="login.jsp" modelAttribute="loginBean">
				<tr>
					<td>
						<form:label path="username">Username : </form:label>
					</td>
					<td>
						<form:input id="username" name="username" path="username" onfocusout="OnlyCharAndNum('username')" /><br>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="password">Password : </form:label>
					</td>
					<td>
						<form:password id="password" name="password" path="password" onfocusout="PasswordValidation('password')" /><br>
					</td>
				</tr>
				<tr>
					<td>
						<input id="submit" type="submit" value="Submit" />
					</td>
				</tr>
			</form:form>
		</table>
	</body>
</html>