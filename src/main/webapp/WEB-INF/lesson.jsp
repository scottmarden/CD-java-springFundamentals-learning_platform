<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lesson Template</title>
</head>
<body>
	<h1>Lesson: <c:out value="${title}" /></h1>
	<div class="navbar">
		<a href="/m/38/0553/0733">Set Up</a>
		<a href="/m/38/0483/0345">Forms</a>
		<a href="/m/38/0553/0342">Cards</a>
		<a href="/m/26/0553/0348">Advanced</a>
		<a href="/m/26/0483/2342">Binary</a>		
	</div>
	<div class="main_content">
		<p><c:out value="${details}" /></p>
	</div>
</body>
</html>