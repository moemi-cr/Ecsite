package com.internousdev.ECsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ECsite2.dto.ItemListDTO;
import com.internousdev.ECsite2.util.DBConnector;

public class ItemDetailsDAO {
	public ItemListDTO getDetailsId(int id) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ItemListDTO dto = new ItemListDTO();

		String sql = "select * from item_info_transaction where id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs =ps.executeQuery();

			if(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
}
