package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String,Object>session;
	private String errorMessage;


	public String execute(){
		String result = null;

		if(!(loginUserId.equals(""))&&!(loginPassword.equals(""))&&!(userName.equals(""))&&loginUserId.equals(session.get("loginUserId"))){
			result = ERROR;
			setErrorMessage("既に登録されているログインIDです");
		}else if(!(loginUserId.equals(""))&&!(loginPassword.equals(""))&&!(userName.equals(""))){  //すべての項目が空欄でなければ
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
			result = SUCCESS;
		}else{
			setErrorMessage("未入力の項目があります。");  //空欄があったらメッセージを表示
			result = ERROR;   //struts.xmlにerrorを送る
		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}
}
