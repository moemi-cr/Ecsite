<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>buyItemComplete</title>
</head>
<body>
	<div id ="header">
	</div>
	<div id="main">
		<div id ="top">
			<p>BuyItemComplete</p>
		</div>
		<div>
			<p>購入手続きが完了しました</p>
			<div>
				<a href='<s:url action="MyPageAction"/>'>マイページ</a><span>からの購入履歴の確認が可能です</span>
				<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>

			</div>
		</div>
	</div>
	<div id="footer">

	</div>
</body>
</html>