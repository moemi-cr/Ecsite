package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemDetailsDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailsAction extends ActionSupport{
	private int id;
	private String itemName;
	private String itemPrice;
	private String itemStock;
	private String insertDate;



	public String execute(){


		String result = SUCCESS;

		ItemDetailsDAO dao = new ItemDetailsDAO();


		ItemListDTO dto = dao.getDetailsId(id);

		System.out.println(dto.getInsertDate());

		if(dto.getItemName()==null){
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}




}
