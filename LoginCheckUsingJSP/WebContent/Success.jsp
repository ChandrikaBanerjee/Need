<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<div>
<jsp:include page="Header.jsp"></jsp:include>
</div>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<h1>Hello ${sessionScope.txtName }</h1>
<div>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</head>
<body>

</body>
</html>