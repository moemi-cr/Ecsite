package com.internousdev.ECsite2.action;



import com.internousdev.ECsite2.dao.CartDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CartItemDeleteAction extends ActionSupport{
		private int id;
	public String execute(){

		CartDAO dao = new CartDAO();


		int delete = dao.deleteCurtItem(id);
		System.out.println(delete);
		if(delete==1){
			System.out.println("成功");
		}else{
			System.out.println("失敗");
		}
		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
