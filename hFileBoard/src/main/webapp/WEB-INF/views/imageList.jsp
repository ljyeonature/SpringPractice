<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 리스트</title>
</head>
<body>
<table border="1">
			
			<c:forEach items="${imageList }" var="image">
				<!-- 프라퍼티이름 변경 -->
				<tr>
					<!-- 추가 -->
						 <img src="resources/upload/${image.b_realfname }" width="200" height="200">			
					
				</tr>
				
			</c:forEach>
		</table>
</body>
</html>