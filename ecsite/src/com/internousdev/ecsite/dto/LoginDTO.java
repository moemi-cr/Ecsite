package com.internousdev.ecsite.dto;

public class LoginDTO {
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg=false;
	private int adminFlg;
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
	public String getUsername(){
		return userName;
	}
	public void setUsername(String userName){
		this.userName=userName;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg=loginFlg;
	}
	public int getAdminFlg() {
		return adminFlg;
	}
	public void setAdminFlg(int adminFlg) {
		this.adminFlg = adminFlg;
	}
}
