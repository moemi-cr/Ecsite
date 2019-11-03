package com.internousdev.ECsite2.dto;


public class BuyItemDTO {
	private int id;
	private String itemName;
	private String itemPrice;
	private int count;
	private int itemStock;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count =count;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
		System.out.println(itemStock);
	}

}
