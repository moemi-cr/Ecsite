package com.internousdev.ECsite2.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemInfoAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private int count;
	private String itemName;
	private String itemPrice;
	private String message;
	private int itemStock;



	public String execute(){
		System.out.println(itemStock);
		return SUCCESS;

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

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	public int getItemStock() {
		return itemStock;
	}



	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

}
