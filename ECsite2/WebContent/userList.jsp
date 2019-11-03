<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserList</title>
</head>
<body>
	<div id ="header">

	</div>
	<div id ="main">
		<div id="top">
			<p>userList</p>
		</div>
		<div>

				<table border="1">
					<tr>
						<th>ユーザーID</th>
						<th>パスワード</th>
						<th>ユーザー名</th>
						<th>詳細</th>
					</tr>
					<s:iterator value="allUserList">
					<tr>
						<td><s:property value="loginUserId"/></td>
						<td>
							<s:property value="loginPassword"/>
						</td>

						<td>
							<s:property value="userName"/>
						</td>
						<td><a href='<s:url action="UserDetailsAction">
							<s:param name="id" value="%{id}"/>
							<s:param name="loginUserId" value="%{loginUserId}"/>
							<s:param name="loginPassword" value="%{loginPassword}"/>
							<s:param name="userName" value="%{userName}"/>
							<s:param name="insertDate" value="%{insertDate}"/>
							</s:url>'>詳細</a></td>
					</tr>
					</s:iterator>
				</table>
				<br>
				<s:form action="UserListDeleteConfirmAction">
					<s:submit value="削除"/>
				</s:form>

				<div>
					<a href='<s:url action="AdminAction"/>'>管理者画面topへ</a>
				</div>
		</div>
	</div>
	<div id="footer">

	</div>
</body>
</html>