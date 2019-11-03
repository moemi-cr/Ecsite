package com.internousdev.ECsite2.action;

import com.internousdev.ECsite2.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailsDeleteCompleteAction extends ActionSupport{
	private int id;
	private String message;


	public String  execute(){


		ItemListDeleteCompleteDAO dao = new ItemListDeleteCompleteDAO();

		int delete = dao.deleteItem(id);

		if(delete > 0){
			message="商品を削除しました";
		}else{
			message="商品の削除に失敗しました";
		}

		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
