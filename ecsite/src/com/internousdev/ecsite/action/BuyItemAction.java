package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private int count;
	private String pay;
	private String message = null;
	BuyItemDAO dao = new BuyItemDAO();
	ArrayList<BuyItemDTO>buyItemList = new ArrayList<BuyItemDTO>();


	public String execute() {

		String result = null;

			result = SUCCESS;

			session.put("count", count); // jspで選択された個数をput
			int intCount = Integer.parseInt(session.get("count").toString()); // 計算したいからintに直す
			System.out.println(intCount);
			int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
			session.put("total_price", intCount * intPrice); // 金額計算
			String payment;
			if (pay.equals("1")) {
				payment = "現金払い";
				session.put("pay", payment);

			} else {
				payment = "クレジットカード";
				session.put("pay", payment);
			}
			int stock = Integer.parseInt(session.get("item_stock").toString());
			System.out.println(stock);
			if(count>stock){
				message="在庫が足りません";

			} else {
				result = SUCCESS;
			}
			return result;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
