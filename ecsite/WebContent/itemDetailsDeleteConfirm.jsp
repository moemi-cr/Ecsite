<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>confirm</title>
</head>
<body>
<div id ="header">

	</div>
	<div id ="main">
		<div id="top">
			<p>itemDetailsDeleteConfirm</p>
		</div>
		<div>
			<h3><s:property value="id"/>の商品を削除してもよろしいですか？</h3>
			<s:form action="ItemDetailsDeleteCompleteAction">
			<s:submit value="OK"/>
			<s:hidden name="id" value="%{id}"/>
			</s:form>
			<s:form action ="ItemListAction">
			<s:submit value="キャンセル"/>
			</s:form>


		</div>
	</div>
	<div id="footer">

	</div>


</body>
</html>