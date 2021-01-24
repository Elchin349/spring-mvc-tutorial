<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
   FirstName: ${student.firstName}
   <br><br>
   LastName: ${student.lastName}
   <br><br>
   Country: ${student.country}
   <br><br>
   Favorite Language: ${student.favoriteLanguage}
   <br><br>
   Operating System:
            <ul>
               <c:forEach var = "item" items = "${student.operatingSystem}">

                   <li> ${item} </li>

               </c:forEach>
            </ul>

   <a href="/">Home</a>
</body>
</html>
