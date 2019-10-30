package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	private ArrayList<BuyItemDTO>buyItemListDAO = new ArrayList<BuyItemDTO>();

	 public BuyItemDTO getBuyItemInfo(){
		 DBConnector db = new DBConnector();
		 Connection con = db.getConnection();
		 BuyItemDTO dto = new BuyItemDTO();



		 String sql="select id, item_name,item_price,item_stock from item_info_transaction";

		 try{
			 PreparedStatement ps = con.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery();

			 while(rs.next()){

				 dto.setId(rs.getInt("id"));
				 dto.setItemName(rs.getString("item_name"));
				 dto.setItemPrice(rs.getString("item_price"));
				 dto.setItemStock(rs.getInt("item_stock"));
				 buyItemListDAO.add(dto);
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }

		 try{
			 con.close();
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return dto;
	 }


}
