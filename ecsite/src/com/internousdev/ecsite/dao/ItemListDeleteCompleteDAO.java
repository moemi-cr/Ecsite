package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemListDeleteCompleteDAO {
	public int result;

	public int delteList(){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="delete from item_info_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			result=ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();

		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	public int deleteItem(int id){
		int delete = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="delete from item_info_transaction where id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			delete = ps.executeUpdate();

			System.out.println(delete);




		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return delete;
	}
}
