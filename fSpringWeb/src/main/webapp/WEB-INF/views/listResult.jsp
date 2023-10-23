<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> /WEB-INF/views/listResult </title>
</head>
<body>

<h2>멤버 리스트</h2>

<table border='2'>
	<tr>
		<td>이름</td>
		<td>아이디</td>
		<td>나이</td>
	</tr>
	<!-- MemberList.java > MemberList 클래스의 list -->
	<c:forEach var='vo' items='${memberList.list }'>
		<tr>
			<td>${vo.name }</td>
			<td>${vo.id }</td>
			<td>${vo.age }</td>
		</tr>
	</c:forEach>
	

</table>



</body>
</html>