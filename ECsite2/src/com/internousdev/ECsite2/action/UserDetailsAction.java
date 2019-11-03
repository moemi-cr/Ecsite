package com.internousdev.ECsite2.action;


import com.internousdev.ECsite2.dao.UserDetailsDAO;
import com.internousdev.ECsite2.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDetailsAction extends ActionSupport{

	private int id;
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String insertDate;

	public String  execute(){
		String result =SUCCESS;

		UserDetailsDAO dao =new UserDetailsDAO();


		UserListDTO dto = dao.UserDetails(loginUserId);
		System.out.println(id);


		if(dto.getUserName()==null){
			dto = null;
		}
		return result;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}


}
