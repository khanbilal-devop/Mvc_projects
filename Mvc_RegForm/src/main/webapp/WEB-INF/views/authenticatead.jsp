<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container {
	border: 2px solid black;
	background-color: gray;
	margin: auto;
	width: 500px;
	margin-top: 30px;
}

.container form {
	margin: 30px;
	color: white;
}

.container input {
	margin: 5px;
}

.container select {
	margin: 5px;
}
</style>
</head>
<body>
<%-- <h1>${message eq (' Wrong password')}</h1>
 --%>
 <h1>${message}</h1>
		<hr>
 <c:set var="message" value="${message eq 'Welcome to your profile'}"></c:set>

  
	<c:if test="${message}">
		<div class="container">
			<form action="searchSt">
				Select your Search parameter : <select name="attribute" >
					<option value="name">Name</option>
					<option value="emailid">Email-Id</option>
					<option value="course">Course</option>
				</select><br> Enter your value : <input type="text" name="value"><br>
				<input type="submit">
			</form>
		</div>
	</c:if>
	
<!-- 	<script type="text/javascript">
	var s = document.getElementById('sel');
	console.log(s.value)
	</script> -->
	<%-- <%=  %>
   <%=m.message %>
	<% if(message.equals("Wrong password") || message.equals("please register first")){ %>
	<h1>${message}</h1>
	<hr>
	<% }else{ %>
	<h1>${message}</h1>
	<hr> 
	 <div class="container">
		<form action="">
			Select your Search parameter : <select name="value">
				<option>name</option>
				<option>emailid</option>
				<option>course</option>
			</select><br> Enter your value : <input type="text" name="value"><br>
			<input type="submit">
		</form>
	</div>
	<%} %> --%>
</body>
</html>