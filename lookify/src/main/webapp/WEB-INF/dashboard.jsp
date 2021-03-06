<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 06-08-21
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>DashBoard</title>
</head>
<body>


<a href="/dashboard/new">Add New</a>  <a href="/search/topten" style="display: inline-block">Top-Ten</a>

<form action="/search/" method="GET" style="display: inline-block">

    <input value="Artista" type="text" id="fname" name="artist">
    <input type="submit" value="Search">
</form>


<table border="1">
    <thead>
    <tr>
        <th>Name</th>
        <th>Rating</th>
        <th>Actions</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listas}" var="artist">
        <tr>
            <td> <a href="/songs/${artist.id}"><c:out value="${artist.title}"/></a></td>

            <td><c:out value="${artist.classification}"/></td>
            <td><a href="/songs/${artist.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
