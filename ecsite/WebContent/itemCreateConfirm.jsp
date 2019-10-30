<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div id ="header">
	</div>
	<div id ="main">
		<div id ="top">
			<p>Home</p>
		</div>
		<div id ="text-center">
			<s:form action="ItemCreateCompleteAction">
			<label>商品名:</label><s:property value="session.itemName"/><br>
			<label>商品価格:</label><s:property value="session.itemPrice"/><br>
			<label>在庫:</label><s:property value="session.itemStock"/><br>
			<s:submit value="完了"/>
			</s:form>
		</div>
	</div>

</body>
</html>