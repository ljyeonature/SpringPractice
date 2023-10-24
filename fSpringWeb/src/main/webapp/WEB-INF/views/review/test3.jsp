<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WEB-INF/views/review/test3.jsp</title>
</head>
<body>
test3
컨트롤러가 보내준 데이터 : ${message}

<hr />
<c:if test="${not empty sessionScope.myid}">
	세션의 myid 값 출력 : ${sessionScope.myid }
</c:if>

<c:if test="${empty sessionScope.myid}">
	환영합니다.
</c:if>
</body>
</html>