package com.internousdev.ECsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite2.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;


	public String execute()throws SQLException{


		BuyItemCompleteDAO bicDAO=new BuyItemCompleteDAO();
		bicDAO.buyItemInfo(session.get("id").toString(),
				session.get("total_price").toString(),
				session.get("count").toString(),
				session.get("login_user_id").toString(),
				session.get("pay").toString());

		bicDAO.updateStock(Integer.parseInt(session.get("count").toString()), session.get("id").toString());

		String result = SUCCESS;
		return result;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

}
