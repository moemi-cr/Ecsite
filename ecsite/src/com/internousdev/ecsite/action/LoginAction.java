package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object>session;
	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	private String message;


	public String execute(){
		LoginDAO logindao=new LoginDAO();
		LoginDTO logindto=new LoginDTO();
		BuyItemDAO biDAO=new BuyItemDAO();
		BuyItemDTO biDTO=new BuyItemDTO();

		ItemListDAO dao = new ItemListDAO();

		String admin="admin";
		String result = ERROR;

		logindto=logindao.getLoginUserInfo(loginUserId,loginPassword);   //jspで入力されたidとpasswordをDTOに格納する
		session.put("loginUser", logindto);   //DAOでFlgには"true"を入れている keyがloginUser

		if(((LoginDTO)session.get("loginUser")).getAdminFlg()==1){
			result = admin ;

		}else if(((LoginDTO)session.get("loginUser")).getLoginFlg()){  //上でputしたのをよびだしてFlgにはtrueが入っているから処理を実行
			itemList = dao.getItemListInfo();
			result=SUCCESS;
			biDTO = biDAO.getBuyItemInfo();

			session.put("login_user_id", logindto.getLoginUserId());   //ログインしたidをput
			session.put("id", biDTO.getId());

			return result;
			}else{
			setMessage("ログインに失敗しました");

		}
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public Map<String,Object> getSession(){
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

	public ArrayList<ItemListDTO> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<ItemListDTO> itemList) {
		this.itemList = itemList;
	}

}

