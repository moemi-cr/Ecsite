package com.internousdev.ECsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite2.util.DBConnector;


public class UserListDeleteCompleteDAO {
	public int result;

	public int deleteUser(){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="delete from login_user_transaction where admin_flg is null";

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
}
