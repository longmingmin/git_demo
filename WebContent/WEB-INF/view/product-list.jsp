<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<thead>
		<tr>
		<td>产品编号</td>
		<td>产品名称</td>
		<td>产品介绍</td>
		<td>对应图标</td>
		<td>最后修改时间</td>
		<td>是否上架</td>
		</tr>
	</thead>
	
	<tbody>
	
	
	
	
	</tbody>
	
	
	</table>
	
	<%   String name="haha";
			pageContext.setAttribute("name",name);
	
	%>
	${name}
</body>
</html>