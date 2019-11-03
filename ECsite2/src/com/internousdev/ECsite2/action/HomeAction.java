package com.internousdev.ECsite2.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite2.dao.ItemListDAO;
import com.internousdev.ECsite2.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();

	public String execute() {
		String result = null;

		ItemListDAO dao = new ItemListDAO();

		itemList = dao.getItemListInfo();

		// login_user_idがあれば(すでにログインしていたら）buyItemjspに、なければlogin.jspに

		if (session.containsKey("login_user_id")) {
			result = SUCCESS;
		} else {
			result = LOGIN;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<ItemListDTO> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<ItemListDTO> itemList) {
		this.itemList = itemList;
	}
}