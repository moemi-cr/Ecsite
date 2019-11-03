package com.internousdev.ECsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite2.util.DBConnector;
import com.internousdev.ECsite2.util.DateUtil;

public class ItemCreateCompleteDAO {
	public void itemCreateCom(String itemName, String itemPrice, String itemStock){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil=new DateUtil();

		String sql ="insert into item_info_transaction(item_name,item_price,item_stock,insert_date)values(?,?,?,?)";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, itemName);
			ps.setString(2, itemPrice);
			ps.setString(3, itemStock);
			ps.setString(4, dateUtil.getDate());

			ps.execute();

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
