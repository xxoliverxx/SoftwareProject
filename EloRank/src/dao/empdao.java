package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.dbutil;

public class empdao {
	//注册插入类
	public static void empzhuceAdd(users emp)
	{
		Connection con=dbutil.getCon();
		String sql="insert into users(name,password) values(?,?)";
		try {
			PreparedStatement prep = con.prepareStatement(sql);
			
			prep.setString(1,emp.name);
			prep.setString(2,emp.password);
			prep.executeUpdate();
			} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//匹配查找类
	public static ArrayList<users> empzhuceLogin(String name,String rank)
	{
		
		ArrayList<users> zhuces=new ArrayList<users>();
		Connection con=dbutil.getCon();//封装dbutil
		String sql="select * from zhuce where name=? rank=?";
		try {
			PreparedStatement prep = con.prepareStatement(sql);
			prep.setString(2,name);
			prep.setString(4,rank);
			
			ResultSet rs=prep.executeQuery();
			while(rs.next())
			{	
				users p1=new users();
				p1.name=rs.getString("name");
				zhuces.add(p1);
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return zhuces;
	}
}
