<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<h2>Hello World!你好</h2>
<c:forEach var="person" items="${requestScope.list}">
    ${person.birth}
</c:forEach>
</body>
</html>
