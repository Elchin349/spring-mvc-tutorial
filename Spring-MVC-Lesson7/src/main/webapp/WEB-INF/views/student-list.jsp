<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
     Student List:
     <table border="1" style="padding: 5px">
         <thead>
         <tr>
             <th>FIRSTNAME</th>
             <th>LASTNAME</th>
             <th>COUNTRY</th>
             <th>FAVORITELANGUAGE</th>
             <th>OPERATINGSYSTEM</th>
         </tr>
         </thead>
         <c:forEach var="student" items="${studentList}" >
             <tr>
                 <td><c:out value="${student.firstName}"/></td>
                 <td><c:out value="${student.lastName}"/></td>
                 <td><c:out value="${student.country}"/></td>
                 <td><c:out value="${student.favoriteLanguage}"/></td>
                     <c:forEach var = "os" items = "${student.operatingSystem}">
                        <td>${os}</td>
                     </c:forEach>
             </tr>
         </c:forEach>
     </table>
</body>
</html>
