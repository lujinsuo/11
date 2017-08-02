package util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
private static final String driver="com.mysql.jdbc.Driver";
private static final String url="jdbc:mysql://10.36.40.26:3306/shopping?useUnicode=true&characterEncoding=Utf-8";
private static final  String user="f_test";
private static final String password="f_test_2015";
private static  Connection conn=null;
//静态代码块负责加载驱动
static {
	
	try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
	
		e.printStackTrace();
	}
	
}

//单例模式返回数据库连接对象
public static Connection getconn(){
	 try {
		
		conn=DriverManager.getConnection(url, user, password);
		if(conn==null){
			
			System.out.println("连接异常");
		}else{
			
			System.out.println("连接正常");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	
	
}

public static void main(String args[]){
	DBHelper DBconn=new DBHelper();
	DBconn.getconn();
	
	
}
}
