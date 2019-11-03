<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title></title>
</head>
<body>
	<div id="header">
	</div>
	<div id ="main">
		<div id ="top">
			<p>ItemListDeleteComplete</p>
		</div>
		<div>
			<s:property value="message"/>


			<div id="text-link">
				<a href='<s:url action="AdminAction"/>'>管理者画面topへ</a>
			</div>
		</div>
	</div>
	<div id ="footer"></div>
</body>
</html>