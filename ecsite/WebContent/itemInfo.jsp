<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>itemInfo</title>

</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>ItemInfo</p>
		</div>
		<s:if test="message!=null">
<!-- 					ActionのIfでelseを通った場合 -->
				<h2>商品の在庫が足りません</h2>
			</s:if>
		<div>
			<s:form action="CurtAction">
				<table border="1">
					<tr>
						<th>商品名</th>
						<th>値段</th>
						<th>個数</th>

					</tr>

					<tr>
						<td><s:property value="itemName" /></td>

						<td><s:property value="itemPrice" /><span>円</span></td>

						<td><select name="count">
								<option value="1" selected="selected">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
						</select></td>
						</tr>
				</table>

					<s:submit value="カートへ" />
					<s:hidden name="itemName" value="%{itemName}" />
					<s:hidden name="itemPrice" value="%{itemPrice}" />
					<s:hidden name="itemStock" value="%{itemStock}"/>

				</s:form>

			<div>
				<p>
					前画面に戻る場合は<a href='<s:url action ="GoHomeAction"/>'>こちら</a>
				</p>
				<p>
					マイページは<a href='<s:url action ="MyPageAction"/>'>こちら</a>
				</p>
			</div>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>