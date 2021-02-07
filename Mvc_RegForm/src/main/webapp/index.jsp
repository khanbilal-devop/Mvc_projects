<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
    <style>
        .container {
            display: inline-block;
            width: 600px;
            border: 2px solid black;
            margin-top: 10px;
            margin-left: 60px;
        }

        .container h2 {
            text-align: center;
        }

        .container form {
            text-align: center;
        }

        .container form input {
            padding: 4px;
            margin-top: 4px;
        }
</style>
</head>
<body>

<h1>Welcome to Mvc Project</h1>
    <hr>
    <div class="container">
        <h2>Student</h2>
            <hr>
            <h2>Register as Student</h2>
            <div>
                <form action="registerStudent" method="post">
                    Enter your emailid : <input type="email" name="emailid"><br>
                    Enter your course : <input type="text" name="course"><br>
                    Enter your name : <input type="text" name="name"><br>
                    Enter your password : <input type="password" name="password"><br>
                    <input type="submit">
                </form>
            </div>
            <h2>Login for student</h2>
            <div>
                <form action="authenticateStudent" method="post">
                    Enter your emailid : <input type="email" name="emailid"><br>
                    Enter your password : <input type="password" name="password"><br>
                    <input type="submit">
                </form>
            </div>
    </div>
    <div class="container">
        <h2>Admin</h2>
            <hr>
            <h2>Register as Admin</h2>
            <div>
                <form action="registerAdmin" method="post">
                    Enter your emailid : <input type="email" name="emailid"><br>
                    Enter your designation : <input type="text" name="designation"><br>
                    Enter your name : <input type="text" name="name"><br>
                    Enter your password : <input type="password" name="password"><br>
                    <input type="submit">
                </form>
            </div>
            <h2>Login for Admin</h2>
            <div>
                <form action="authenticateAdmin" method="post">
                    Enter your emailid : <input type="email" name="emailid"><br>
                    Enter your password : <input type="password" name="password"><br>
                    <input type="submit">
                </form>
            </div>
    </div>


</body>
</html>