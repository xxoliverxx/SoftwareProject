package util;
import  java.sql.Connection;
import java.sql.DriverManager;

public class dbutil {
	
	public static Connection getCon()//方法
	{
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/elouser?useUnicode&characterEncoding=utf8";
			String name="root";
			String pwd="";
			con=DriverManager.getConnection(url,name,pwd);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//修饰词 方法返回类型 方法名（参数）{方法体}
		return con;
	}
	
}
