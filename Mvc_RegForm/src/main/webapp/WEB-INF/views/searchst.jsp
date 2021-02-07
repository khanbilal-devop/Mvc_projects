<%@page import="com.spring.entities.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <style>
   th{
    border: 2px solid black;
    padding: 20px;
    text-align: left
   }
   td{
    border: 2px solid black;
    padding: 20px;
    text-align: center;
   }
   table{
       margin: auto;
       margin-top: 200px;
       width: 500px;
       
   }
    
</style>
</head>
<body>
	<h1>${message}</h1>
	<hr>
	
	<c:if test="${List != null}">
		<table style="border: 2px solid black;border-collapse: collapse;">
			<tr>
				<th>Name</th>
				<th>Course</th>
				<th>Email</th>
			</tr>
			<c:forEach items="${List}" var="i">
             <tr>
             <td> ${i.name} </td>
             <td> ${i.course} </td>
             <td> ${i.emailid} </td>
             </tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>