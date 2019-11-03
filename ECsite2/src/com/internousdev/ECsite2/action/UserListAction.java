package com.internousdev.ECsite2.action;

import java.util.ArrayList;

import com.internousdev.ECsite2.dao.UserListDAO;
import com.internousdev.ECsite2.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport {

	private ArrayList<UserListDTO>allUserList = new ArrayList<UserListDTO>();

	public String execute(){
		UserListDAO dao = new UserListDAO();


		allUserList = dao.getUserList();

		return SUCCESS;


	}
	public ArrayList<UserListDTO> getAllUserList() {
		return allUserList;
	}
	public void setAllUserList(ArrayList<UserListDTO> allUserList) {
		this.allUserList = allUserList;
	}

}
