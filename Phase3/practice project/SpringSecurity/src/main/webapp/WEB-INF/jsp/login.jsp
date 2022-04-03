<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Login</title>
    </head>
    <body>
    <center>
        <div th:if="${param.error}">
            Invalid username or password.
        </div><br>
        <div th:if="${param.logout}">
            You have been logged out.
        </div><br>
        <form th:action="@{/login}" method="post">
            <div><label> User Name : <input type="text" name="username"/> </label></div><br>
            <div><label> Password: <input type="password" name="password"/> </label></div><br>
            <div><input type="submit" value="Sign In"/></div><br>

        </form>
        
        <a href="/">Return to Main Page</a>
    </center>
    </body>
</html>