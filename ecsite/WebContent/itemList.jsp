<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品リスト</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>ItemList</p>
		</div>
		<div>

				<table border="1">
					<tr>

						<th>商品名</th>
						<th>値段</th>
						<th>在庫</th>
						<th>詳細</th>

					</tr>
					<s:iterator value="itemListInfo">
						<tr>

							<td><s:property value="itemName" /></td>
							<td><s:property value="itemPrice" /> <span>円</span></td>

							<td><s:property value="itemStock" /> <span>個</span></td>

							<td>
							<a href='<s:url action="ItemDetailsAction">
							<s:param name="id" value="%{id}"/>
							<s:param name="itemName" value="%{itemName}"/>
							<s:param name="itemPrice" value="%{itemPrice}"/>
							<s:param name="itemStock" value="%{itemStock}"/>
							<s:param name="insertDate" value="%{insertDate}"/>
							</s:url>'>詳細</a></td>
						</tr>
					</s:iterator>
				</table>

				<s:form action ="ItemListDeleteConfirmAction">
				<s:submit value="削除"/><br>
				</s:form>
			<div id="text-right">
				<br>
				<div>
					<a href='<s:url action="AdminAction"/>'>管理者画面topへ</a>
				</div>

			</div>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>