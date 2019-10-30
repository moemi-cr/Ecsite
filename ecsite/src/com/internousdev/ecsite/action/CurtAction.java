package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.CurtDAO;
import com.internousdev.ecsite.dto.CurtDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CurtAction extends ActionSupport implements SessionAware {
	private String itemName;
	private String itemPrice;
	private int count;
	private int itemStock;
	private String message;
	private ArrayList<CurtDTO> addCurtList = new ArrayList<CurtDTO>();
	public int sum = 0;

	private Map<String, Object> session;

	public String execute() {
		CurtDAO dao = new CurtDAO();
		String result = ERROR;
		System.out.println(itemStock);
		if (count > itemStock) {
			message="在庫が足りません";

		} else {
			result = SUCCESS;

			session.put("count", count); // jspで選択された個数をput
			session.put("itemName", itemName);
			session.put("itemPrice", itemPrice);

			dao.InsertCurt(session.get("login_user_id").toString(), itemName, itemPrice,
					Integer.parseInt(session.get("count").toString()));

			String loginUserId = session.get("login_user_id").toString();
			addCurtList = dao.CurtList(loginUserId);

			for (int i = 0; i < addCurtList.size(); i++) {
				int totalPrice = Integer.parseInt(addCurtList.get(i).getItemPrice()) * addCurtList.get(i).getCount();

				sum = sum + totalPrice;
			}
			System.out.println(sum);
		}
		return result;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getCount() {
		return count;

	}

	public void setCount(int count) {
		this.count = count;
		System.out.println(count);
	}

	public ArrayList<CurtDTO> getAddCurtList() {
		return addCurtList;
	}

	public void setAddCurtList(ArrayList<CurtDTO> addCurtList) {
		this.addCurtList = addCurtList;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
