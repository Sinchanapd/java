<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>

<center>
	<b>Welcome to FlyAway Admin  Login </b> 
 	<div style="border: 2px solid black; width: 25%; border-radius: 20px; padding: 20px"; align="center";>
     <form action="AdminLogin" method="post">
        Email <input name="email" type="text"><br><br>
        Password <input name="pass" type="password"><br><br>
        <button type="submit" value="Submit">LogIn</button>
     </form>  
    </div>
</center>
</body>
</html>