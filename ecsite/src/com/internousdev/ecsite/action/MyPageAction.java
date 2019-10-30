package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MyPageDAO;
import com.internousdev.ecsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;
	private MyPageDAO mpDAO = new MyPageDAO();
	private ArrayList<MyPageDTO>myPageList=new ArrayList<MyPageDTO>();
	private String deleteFlg;
	private String message;




	public String execute()throws SQLException{
		if(!session.containsKey("login_user_id")){
			return ERROR;
		}
		//購入履歴のを表示
		if(deleteFlg==null){
			String item_transaction_id = session.get("id").toString();
			String user_master_id=session.get("login_user_id").toString();
			myPageList=mpDAO.getMyPageUserInfo(item_transaction_id, user_master_id);  //DAOのwhileでdtoに格納したものが入ってくる

		}else if(deleteFlg.equals("1")){
			delete();
		}
		String result=SUCCESS;
		return result;
	}
	//履歴削除
	public void delete()throws SQLException{
		MyPageDAO mpDAO = new MyPageDAO();

		String item_transaction_id = session.get("id").toString();
		String user_master_id=session.get("login_user_id").toString();

		int res = mpDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);
		if(res>0){     //削除した件数があれば
			myPageList=null;
			setMessage("商品を正しく削除しました");

		}else if(res==0){
			setMessage("商品情報の削除に失敗しました");
		}
	}

	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}
	public Map<String,Object> getSessioin(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}
	public ArrayList<MyPageDTO> getMyPageList(){
		return myPageList;
	}
	public void setMyPageList(ArrayList<MyPageDTO>myPageList){
		this.myPageList=myPageList;
	}

}
