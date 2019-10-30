package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport{
	private String message=null;

	public String execute(){
		String result = SUCCESS;
		UserListDeleteCompleteDAO dao = new UserListDeleteCompleteDAO();

		int ret = dao.deleteUser();

		if(ret > 0){
			setMessage("商品を削除しました");
			System.out.println("成功");

		}else{
			setMessage("商品の削除に失敗しました");
			System.out.println("失敗");

		}

		return result;

	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
