package com.internousdev.ECsite2.action;


import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteConfirmAction extends ActionSupport implements SessionAware{
	private ArrayList<Object> itemList1 = new ArrayList<Object>();
	private Map<String, Object> session;


	public String execute(){

		return SUCCESS;

	}
	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public ArrayList<Object> getItemList1() {
		return itemList1;
	}
	public void setItemList(ArrayList<Object> itemList1) {
		this.itemList1 = itemList1;
	}

}
