<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemDeleteConfirm</title>
</head>
<body>
<div id ="header">

	</div>
	<div id ="main">
		<div id="top">
			<p>MyPage</p>
		</div>
		<div>
			<h3>商品を削除してもよろしいですか？</h3>
			<s:form action="ItemListDeleteCompleteAction">

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

						</tr>
					</s:iterator>
				</table>

			<s:submit value="OK"/>
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