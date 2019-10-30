package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport {

	private String message=null;

	public String execute(){
		String result = SUCCESS;
		ItemListDeleteCompleteDAO dao= new ItemListDeleteCompleteDAO();

		int delete = dao.delteList();

		if(delete>0){
			setMessage("商品を削除しました");
			System.out.println("せいこう");
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
