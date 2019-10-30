package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailsDeleteConfirmAction extends ActionSupport {
	private int Id;

	public String execute() {

		return SUCCESS;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

}