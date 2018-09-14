<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<html>
<head>
	<title>Home</title>
	
	<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">	
</head>
<body>
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>


<table class="table table-hover">
<tr>
<td>번호</td>
<td>제목</td>
<td>시간</td>
<td>조회수</td>
</tr>

<c:forEach var="list" items="${list}">
<tr>
<td>${list.seq}</td>
<td><a href="${path}/getBoard?seq=${list.seq}">${list.title}</a></td>
<td>${list.bdate}</td>
<td>${list.hit}</td>
</tr>
</c:forEach>




</table>


</body>
</html>
