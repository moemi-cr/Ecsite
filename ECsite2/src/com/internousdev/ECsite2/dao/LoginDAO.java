package com.internousdev.ECsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ECsite2.dto.LoginDTO;
import com.internousdev.ECsite2.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO loginDTO = new LoginDTO();

		String sql = "select * from login_user_transaction where login_id=? and login_pass=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);


			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				loginDTO.setLoginUserId(rs.getString("login_id"));  //ユーザー情報を検索
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUsername(rs.getString("user_name"));

											//loginDTOのseterに値を格納

				if(rs.getString("login_Id") != null) {  //login_Idに値が入っていいれば
					loginDTO.setLoginFlg(true);   //フラグにtrue
				}
					if(rs.getInt("admin_flg")==1){
						loginDTO.setAdminFlg(1);

					}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginDTO;
	}
}
