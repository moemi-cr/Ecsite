<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ユーザー詳細</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>userDetails</p>
		</div>
		<div>
			<s:form action="ItemDetailsAction">
				<table border="1">
					<tr>
						<td>id</td>
						<th>ユーザーID</th>
						<th>パスワード</th>
						<th>ユーザー名</th>
						<th>登録日</th>

					</tr>

					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="loginUserId" /></td>
						<td><s:property value="loginPassword" /></td>

						<td><s:property value="userName" /></td>
						<td><s:property value="insertDate" /></td>

					</tr>

				</table>
			</s:form>
			<br>
			<s:form action="UserDeleteConfirmAction">
				<s:submit value="削除" />
				<s:hidden name="loginUserId" value="%{loginUserId}"/>
			</s:form>

			<div>
				<a href='<s:url action="AdminAction"/>'>管理者画面topへ</a>
			</div>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>