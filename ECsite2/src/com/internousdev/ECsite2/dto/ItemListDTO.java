package com.internousdev.ECsite2.dto;

public class ItemListDTO {
	private int id;
	private String itemName;
	private String itemPrice;
	private int itemStock;
	private String insertDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}
	public int getItemStock(){
		return itemStock;
	}
	public void setItemStock(int itemStock){
		this.itemStock=itemStock;
	}
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

}
