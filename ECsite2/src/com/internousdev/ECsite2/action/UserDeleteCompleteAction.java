package com.internousdev.ECsite2.action;

import com.internousdev.ECsite2.dao.UserDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteCompleteAction extends ActionSupport{
	private String loginUserId;
	private String message;
	public String execute(){
		String result = SUCCESS;

		UserDeleteCompleteDAO dao = new UserDeleteCompleteDAO();
		int delete = dao.UserDelete(getLoginUserId());

		if(delete > 0){
			setMessage("商品を削除しました");
		}else{
			setMessage("商品の削除に失敗しました");
		}

		return result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
}
