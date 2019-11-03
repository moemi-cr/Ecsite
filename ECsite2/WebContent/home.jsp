<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Home</title>
</head>
<body>
	<div id="header">
	</div>
	<div id ="main">
		<div id ="top">
			<p>Home</p>
		</div>
		<div id="text-center">
			<s:form action="HomeAction">
				<s:submit value="商品購入"/>
			</s:form>


<!-- 			      追加機能                   -->
			<s:form action="AdminAction">
				<s:submit value="管理者"/>
			</s:form>
<!-- 			         ////                    -->




<!-- 			login_user_idが空でなければログアウトを表示 -->
			<s:if test="#session.login_user_id != null">
				<p>ログアウトする場合は
					<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
			</s:if>
		</div>
	</div>
	<div id ="footer">

	</div>
</body>
</html>