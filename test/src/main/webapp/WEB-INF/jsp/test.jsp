<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
	<h2>Hello! ${name}</h2>
	<div>JSP List Test</div>
	<c:forEach var="TestVO" items="${list}" varStatus="idx">
	${idx.index} ${TestVO.userID} ${TestVO.createDate} <br />
	</c:forEach>
</body>
</html>