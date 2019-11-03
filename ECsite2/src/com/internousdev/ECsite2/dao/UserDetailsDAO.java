package com.internousdev.ECsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ECsite2.dto.UserListDTO;
import com.internousdev.ECsite2.util.DBConnector;

public class UserDetailsDAO {
	public UserListDTO UserDetails(String loginUserId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		UserListDTO dto = new UserListDTO();

		String sql ="select * from login_user_transaction where login_id =?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setLoginUserId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsertDate(rs.getString("insert_date"));
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}
}
