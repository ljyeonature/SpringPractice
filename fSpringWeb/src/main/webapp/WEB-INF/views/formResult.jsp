<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formResult</title>
</head>
<body>
	<h2>사용자 입력값을 아래에 출력</h2>
	
	
	아이디 : ${memberVO.id } <br />
	이  름 : ${memberVO.name } <br /> 
	나  이 : ${memberVO.age } <hr />
	
	${sessionScope.login}님 로그인하였습니다.
</body>
</html>