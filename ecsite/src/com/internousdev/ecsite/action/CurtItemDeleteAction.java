package com.internousdev.ecsite.action;



import com.internousdev.ecsite.dao.CurtDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CurtItemDeleteAction extends ActionSupport{
		private int id;
	public String execute(){

		CurtDAO dao = new CurtDAO();


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
