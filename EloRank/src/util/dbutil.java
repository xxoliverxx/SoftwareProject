package util;
import  java.sql.Connection;
import java.sql.DriverManager;

public class dbutil {
	
	public static Connection getCon()//����
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
		//���δ� ������������ ��������������{������}
		return con;
	}
	
}
