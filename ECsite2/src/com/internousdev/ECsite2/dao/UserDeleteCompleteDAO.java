package com.internousdev.ECsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite2.util.DBConnector;

public class UserDeleteCompleteDAO {
	public int UserDelete(String loginUserId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int delete=0;
		String sql = "delete from login_user_transaction where login_id =?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			delete = ps.executeUpdate();


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
