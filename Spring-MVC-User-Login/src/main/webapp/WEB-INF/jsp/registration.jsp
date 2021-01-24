<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" pageEncoding="ISO-8859-1" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
    <title>Registration</title>
</head>
<body>
<form:form method="post" id="registrationForm" modelAttribute="user" action="registration-form">
    <table align="center">
        <h2 align="center">REGISTRATION</h2><br>
        <tr>
            <td><form:label path="username" id="username">Username</form:label></td>
            <td><form:input path="username" id="username" name="username"/></td>
            <td><form:errors path="username"/></td>
        </tr>
        <tr>
            <td><form:label path="password" id="password">Password</form:label></td>
            <td><form:input path="password" id="password" name="password"/></td>
            <td><form:errors path="password"/></td>
        </tr>
        <tr>
            <td><form:label path="firstName" id="firstName">FirstName</form:label></td>
            <td><form:input path="firstName" id="firstName" name="firstName"/></td>
            <td><form:errors path="firstName"/></td>
        </tr>
        <tr>
            <td><form:label path="lastName" id="lastName">LastName</form:label></td>
            <td><form:input path="lastName" id="lastName" name="lastName"/></td>
            <td><form:errors path="lastName"/></td>
        </tr>
        <tr>
            <td><form:label path="email" id="email">Email</form:label></td>
            <td><form:input path="email" id="email" name="email"/></td>
            <td><form:errors path="email"/></td>
        </tr>
        <tr>
            <td><form:label path="address" id="address">Address</form:label></td>
            <td><form:input path="address" id="address" name="address"/></td>
            <td><form:errors path="address"/></td>
        </tr>
        <tr>
            <td><form:label path="phone" id="phone">Phone</form:label></td>
            <td><form:input path="phone" id="phone" name="phone"/></td>
            <td><form:errors path="phone"></form:errors></td>
        </tr>

        <tr>
            <td></td>
            <td><form:button id="register" name="register">Register</form:button></td>
        </tr>
        <tr></tr>
        <tr>
            <td></td>
            <td><a href="/">Home</a></td>
        </tr>
    </table>
</form:form>
</body>
</html>
