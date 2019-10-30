<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
	</div>
	<div id ="main">
		<div id ="top">
			<p>Curt</p>
		</div>
		<div>

			<table border="1">
			<tr>

				<th>商品名</th>
				<th>値段</th>
				<th>個数</th>



			</tr>
			<s:iterator value="addCurtList">
				<tr>

					<td><s:property value="itemName" /></td>
					<td><s:property value="itemPrice" /> <span>円</span></td>
					<td><s:property value="count"/></td>
					<td><a href='<s:url action="CurtItemDeleteAction">
							<s:param name="id" value="%{id}"/>
							</s:url>'>削除</a></td>

				</tr>
			</s:iterator>
			</table>

				<div>
				<h3>合計金額:<s:property value="sum"/>円
				<br>
				<br>
				支払方法
				<br>
						<input type="radio" name="pay" value="1" checked="checked">現金払い
						<input type="radio" name="pay" value="2">クレジットカード
				</h3>
				<s:submit value="購入"/>
				</div>
				<br>
				<div>
					<p>前画面に戻る場合は<a href='<s:url action ="GoHomeAction"/>'>こちら</a></p>
					<p>マイページは<a href='<s:url action ="MyPageAction"/>'>こちら</a></p>
				</div>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>