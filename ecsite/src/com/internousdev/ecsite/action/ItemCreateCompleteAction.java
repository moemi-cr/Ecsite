package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware {
	private Map<String,Object>session;

	public String execute(){
		String result = SUCCESS;

		ItemCreateCompleteDAO dao = new ItemCreateCompleteDAO();
		System.out.println(session.get("itemName"));

		dao.itemCreateCom(session.get("itemName").toString(),session.get("itemPrice").toString(), session.get("itemStock").toString());

		return result;

	}
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
}
