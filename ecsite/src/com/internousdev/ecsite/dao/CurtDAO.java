package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.CurtDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class CurtDAO {
	private ArrayList<CurtDTO>curtList = new ArrayList<CurtDTO>();


	public void InsertCurt(String loginUserId,String itemName, String itemPrice, int count){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil=new DateUtil();

		String sql="insert into cart_info(user_id,item_name,item_price,product_count,regist_date)values(?,?,?,?,?)";

		try{
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1, loginUserId);
		ps.setString(2, itemName);
		ps.setString(3, itemPrice);
		ps.setInt(4, count);
		ps.setString(5, dateUtil.getDate());

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

	public ArrayList<CurtDTO> CurtList(String loginUserId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();


		String sql="select *  from cart_info where user_id=?";

		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				CurtDTO dto = new CurtDTO();
				dto.setId(rs.getInt("id"));
				dto.setLoginUserId(rs.getString("user_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setCount(rs.getInt("product_count"));
				curtList.add(dto);
			}
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return curtList;
	}

	public int deleteCurtItem(int id){
		int delete = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "delete from cart_info where id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
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

	public ArrayList<CurtDTO> getCurtList() {
		return curtList;
	}

	public void setCurtList(ArrayList<CurtDTO> curtList) {
		this.curtList = curtList;
	}
	}
