package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.user;

import util.DBHelper;



public class insetData {
	Connection conn=null;
	PreparedStatement stmt=null;
	String sql="insert into user value(?,?)";
	

	public void insertData(user user){

		try {
			conn=new DBHelper().getconn();
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getPassword());
			stmt.executeUpdate();
			System.out.println("≤Â»Î≥…π¶");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}


	}
	
	public static void main(String args[]){
		user user1=new user();
		user1.setName("aa1");
		user1.setPassword("3333");
		insetData insert=new insetData();
		insert.insertData(user1);
		
	}


}
