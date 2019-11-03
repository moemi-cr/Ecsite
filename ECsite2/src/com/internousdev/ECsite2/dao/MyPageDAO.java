package com.internousdev.ECsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ECsite2.dto.MyPageDTO;
import com.internousdev.ECsite2.util.DBConnector;
public class MyPageDAO {
	public ArrayList<MyPageDTO> getMyPageUserInfo(String item_transaction_id,String user_master_id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<MyPageDTO>myPageDTO = new ArrayList<MyPageDTO>();

		String sql="select ubit.id, iit.item_name,ubit.total_price,ubit.total_count,ubit.pay,ubit.insert_date "
				+ "from user_buy_item_transaction ubit "
				+ "left join item_info_transaction iit "
				+ "on ubit.item_transaction_id=iit.id "
				+ "where ubit.item_transaction_id=? and ubit.user_master_id=? "
				+ "order by insert_date DESC";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);

			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				MyPageDTO dto = new MyPageDTO();   //whileの中でインスタンス化しないといけない whileの外でインスタンス化するとすべて上書きされてしまう
				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setTotalPrice(rs.getString("total_price"));
				dto.setTotalCount(rs.getString("total_count"));
				dto.setPay(rs.getString("pay"));
				dto.setInsert_date(rs.getString("insert_date"));
				myPageDTO.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return myPageDTO;
	}
	public int buyItemHistoryDelete(String item_transaction_id, String user_master_id) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "delete from user_buy_item_transaction where item_transaction_id=? AND user_master_id=?";
			//商品のIDとユーザーのIdが一致する一行を消す
		int result = 0;

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);

			result = ps.executeUpdate();    //削除した件数を返す
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
