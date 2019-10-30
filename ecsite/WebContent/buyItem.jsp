<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>BuyItem</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>BuyItem</p>
		</div>
		<div>


				<table border=1>
					<tr>
						<th>商品名</th>
						<th>価格</th>
						<th>在庫</th>
					<tr>
						<s:iterator value="itemList">
							<tr>
								<td><s:property value="itemName" /></td>


								<td><s:property value="itemPrice" /><span>円</span></td>
								<td><s:property value="itemStock" /><span>個</span></td>


								<td><a
									href='<s:url action="ItemInfoAction">
						<s:param name="itemName" value="%{itemName}"/>
 						<s:param name="itemPrice" value="%{itemPrice}"/>
 						<s:param name="itemStock" value="%{itemStock}"/>

							</s:url>'>購入</a>

								</td>
							</tr>
						</s:iterator>

				</table>
			<br>

			<s:if test="message != null">
				<h3>
					<s:property value="message" />
				</h3>
			</s:if>
			<div>
				<p>
					前画面に戻る場合は<a href='<s:url action ="GoHomeAction"/>'>こちら</a>
				</p>
				<p>
					<a href='<s:url action ="CurtAction"/>'>カートの中身を見る</a>
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