<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="foreMeta.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>


	<form action="<c:url value="/fore/index"/>" >
		<input name="username">
		<input name="password">
		<input type="submit">
		注册了
	</form>
	
	<a href="<c:url value="/forward/fore/reg"/>">注册</a>
</body>

</html>