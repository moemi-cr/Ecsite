<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemDetails</title>
</head>
<body>
<div id="header">
	</div>
	<div id ="main">
		<div id ="top">
			<p>商品詳細</p>
		</div>
		<div id="text-center">

				<s:form action ="ItemDetailsAction">
				<table border="1">
					<tr>
						<th>ID</th>
						<th>商品名</th>
						<th>値段</th>
						<th>在庫</th>



					</tr>
					<tr>
							<td><s:property value="id" /></td>
							<td><s:property value="itemName" /></td>
							<td><s:property value="itemPrice" /> <span>円</span></td>

							<td><s:property value="itemStock" /> <span>個</span></td>

					</tr>

				</table>
				</s:form>
				<s:form action="ItemDetailsDeleteConfirmAction">
				<s:submit value="削除"/>
				<s:hidden name="id" value="%{id}"/>
				</s:form>





				<p>前画面に戻るには
					<a href='<s:url action="ItemListAction"/>'>こちら</a></p>

		</div>
	</div>
	<div id ="footer">

	</div>
</body>
</html>