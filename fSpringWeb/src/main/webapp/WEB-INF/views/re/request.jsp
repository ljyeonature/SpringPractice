<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> re/request.jsp </title>
</head>
<body>
	<h2> request.do 요청 </h2>
	<h3>get</h3>
	아이디 : ${param.id } <br />
	이 름 : ${param.name } <br />
	나 이 : ${param.age } <hr />
	
	<h3>post memberVO</h3>
	<!-- 스프링은 memberVO==MemberVO로 사용 -->
	<!-- 내가 지은 vo은 Contorller에서만 사용 -->
	<!-- Controller에서 MedelAttribute로 vo 이름 설정 -->
	아이디 : ${memberVO.id } <br />
	이 름 : ${memberVO.name } <br />
	나 이 : ${memberVO.age } <hr />
	
	<h3>post vo</h3>
	<!-- 스프링은 memberVO==MemberVO로 사용 -->
	<!-- 내가 지은 vo은 Contorller에서만 사용 -->
	<!-- Controller에서 MedelAttribute로 vo 이름 설정 -->
	아이디 : ${vo.id } <br />
	이 름 : ${vo.name } <br />
	나 이 : ${vo.age } <hr />
	
	
	
	
</body>
</html>