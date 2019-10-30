package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {
	public ArrayList<ItemListDTO> getItemListInfo(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<ItemListDTO>itemList = new ArrayList<ItemListDTO>();

		String sql="select * from item_info_transaction";

		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemListDTO dto = new ItemListDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				itemList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			 e.printStackTrace();
		}
		return itemList;
	}
	public int itemListDelete(String itemName){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="delete from item_info_transaction where item_name=?";
		int result = 0;

		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1, itemName);

			result = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
}
