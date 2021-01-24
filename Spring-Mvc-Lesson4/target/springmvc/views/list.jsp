<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--yuxaridaki taglibi duzeltmek ucun mavende dependency ni yazmalisiz--%>
<html>
<head>
    <title>List</title>
</head>
<body>

    Product Names:
    <ul>
        <c:forEach items="${productsName}" var="name">
            <li><c:out value="${name}"/></li>
        </c:forEach>
    </ul>
    Product Objects:
    <table border="1" style="padding: 5px">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>CATEGORY</th>
            <th>PRICE</th>
            <th>DESCRIPTION</th>
        </tr>
        </thead>
        <c:forEach items="${productsObject}" var="product">
            <tr>
                <td><c:out value="${product.id}"/></td>
                <td><c:out value="${product.name}"/></td>
                <td><c:out value="${product.category}"/></td>
                <td><c:out value="${product.price}"/></td>
                <td><c:out value="${product.description}"/></td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
