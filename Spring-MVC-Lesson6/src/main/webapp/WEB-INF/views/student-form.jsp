
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <form:form action="process-form" modelAttribute="student" method="post">
         First Name: <form:input path="firstName"/>
         <br><br>
         LastName: <form:input path="lastName"/>
         <br><br>
         Country:
             <form:select path="country">
                 <form:options items="${student.countryOptions}"/>
             </form:select>
         <br><br>

         Favorite Language:
              Java: <form:radiobutton path="favoriteLanguage" value="Java"/>
              C#: <form:radiobutton path="favoriteLanguage" value="C#"/>
              Python: <form:radiobutton path="favoriteLanguage" value="Python"/>
              Kotlin: <form:radiobutton path="favoriteLanguage" value="Kotlin"/>
         <br><br>

         Operating System:

             Linux: <form:checkbox path="operatingSystem" value="Linux"/>
             MAC OS: <form:checkbox path="operatingSystem" value="MAC OS"/>
             Windows: <form:checkbox path="operatingSystem" value="Windows"/>
         <br><br>

         <input type="submit" value="Submit">
     </form:form>
</body>
</html>
