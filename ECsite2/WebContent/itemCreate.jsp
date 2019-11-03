<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品登録</title>
</head>
<body>
	<div id="header"></div>

	<div id="main">
		<div id="top">
			<p>ItemCreate</p>
		</div>
		<div>
			<s:form action="ItemCreateConfirmAction">
				<label>商品名:</label>
				<input type="text" name="itemName" />
				<br>
				<label>商品価格:</label>
				<input type="text" name="itemPrice" />
				<br>
				<label>在庫:</label>
				<input type="text" name="itemStock" />
				<br>
				<s:submit value="登録" />

			</s:form>

		</div>
	</div>

	<div id="footer"></div>


</body>
</html>