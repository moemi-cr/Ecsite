<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserDeleteConfirm</title>
</head>
<body>
<div id ="header">

	</div>
	<div id ="main">
		<div id="top">
			<p>UserDetailsDeleteConfirm</p>
		</div>
		<div>
			<h3><s:property value="loginUserId"/>さんの情報をを削除してもよろしいですか？</h3>
			<s:form action="UserDeleteCompleteAction">
			<s:submit value="OK"/>
			<s:hidden name="loginUserId" value="%{loginUserId}"/>
			</s:form>
			<s:form action ="UserListAction">
			<s:submit value="キャンセル"/>
			</s:form>


		</div>
	</div>
	<div id="footer">

	</div>
</body>
</html>