<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<c:forEach items="${list}" var="i">
		<tr>
			<td>${i.name}</td>
			<td>${i.age}</td>
			<td>${i.id}</td>
			<td>${i.address}</td>
			<td><a href="Add.jsp">增加</a></td>
			<td><a href="">删除</a></td>
			<td><a href="">更改</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>