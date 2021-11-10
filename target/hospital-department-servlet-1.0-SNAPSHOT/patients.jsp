<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="WEB-INF/includes/header-links.jsp"%>

    <title>Patients</title>
</head>
<body>
<%@include file="WEB-INF/includes/nav-bar.jsp"%>
<div style="text-align: center;">
    <h1>Patients</h1>

    <c:forEach var="u" items="${patients}">
        <p><c:out value="${u.getId()}"></c:out></p>
    </c:forEach>

</div>


<%@include file="WEB-INF/includes/footer-links.jsp"%>
</body>
</html>
