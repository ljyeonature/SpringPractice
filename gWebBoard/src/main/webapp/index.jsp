<%@page contentType="text/html; charset=EUC-KR"%>
<% String pjName = "/gWebBoard"; %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Main Page</title>
</head>
<body>

		<h1>게시판 프로그램</h1>
		<hr>
		<br> <a href="board/getBoardList.do">글 목록 바로가기</a>
		<hr>
		<br>
		<br> <a href="<%=pjName %>/board/getBoardList.do">글 목록 바로가기</a>
		
		<hr />
		<a href='cate/temp.do'>카테테스트</a>
		

</body>
</html>