<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>JSP List Test</div>
	<c:forEach var="MonthVO" items="${list}" varStatus="idx">
	${MonthVO.createtime} ${MonthVO.count} <br />
	</c:forEach>
</body>
</html>