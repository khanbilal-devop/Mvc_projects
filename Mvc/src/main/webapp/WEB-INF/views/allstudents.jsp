<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.spring.entities.Student" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<Student> al = (ArrayList<Student>)request.getAttribute("allstudents");
     for(Student st : al){ %>
<h1> <%= st %> </h1>
<% } %>
</body>
</html>