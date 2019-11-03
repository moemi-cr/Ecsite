package com.internousdev.ECsite2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver";   //mysql-connector.jar
	private static String url="jdbc:mysql://localhost/ecsite";	//接続したいデータベース名

	private static String user="root";
	private static String password="mysql";

	public Connection getConnection(){
		Connection con = null; //接続状態を管理するクラス

		try{
			Class.forName(driverName);   //classというスーパークラスの中のforNameメソッドを呼び出してdriverNameを使えるようにする
			con=(Connection)DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
