package com.internousdev.ECsite2.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite2.dao.ItemListDAO;
import com.internousdev.ECsite2.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{

	private ArrayList<ItemListDTO> itemListInfo = new ArrayList<ItemListDTO>();
	private Map<String, Object> session;

	private int id;



	public String execute() {
		String result = SUCCESS;
		ItemListDAO dao= new ItemListDAO();

			itemListInfo = dao.getItemListInfo();
			session.put("itemList", itemListInfo);


			if(itemListInfo.get(id)!=null)
			{
				System.out.println("成功:" + itemListInfo.get(0).getId() + itemListInfo.get(0).getItemName());
				System.out.println("成功:" + itemListInfo.get(1).getId() + itemListInfo.get(1).getItemName());
			}else
			{
				System.out.println("失敗" + itemListInfo.get(id));
			}


		return result;
	}

	public ArrayList<ItemListDTO> getItemListInfo(){
		return itemListInfo;
	}
	public void setItemListInfo(ArrayList<ItemListDTO>itemListInfo){
		this.itemListInfo=itemListInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
