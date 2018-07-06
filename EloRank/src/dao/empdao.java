package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.dbutil;

public class empdao {
	//注册插入方法
	public static void usersLogin(users emp)
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
	//匹配查找方法
	public static ArrayList<users> usersMatch(String name,String rank)
	{
		
		ArrayList<users> zhuces=new ArrayList<users>();
		Connection con=dbutil.getCon();//封装dbutil
		String sql="select * from zhuce where name=? rank=?";
		try {
			PreparedStatement prep = con.prepareStatement(sql);
			prep.setString(1,name);
			prep.setString(2,rank);
			
			ResultSet rs=prep.executeQuery();
			while(rs.next())
			{	
				users p1=new users();
				p1.name=rs.getString("name");
				p1.rank=rs.getString("rank");
				zhuces.add(p1);
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return zhuces;
	}
	//查看排名方法
	//集合ArrayList 该集合存储emp表中查询出的所有数据
	public static ArrayList<users> userslist()
	{
		
		ArrayList<users> users=new ArrayList<users>();
		Connection con=dbutil.getCon();//封装dbutil
		String sql="select id,name,score,rank from users";
		try {
			PreparedStatement prep = con.prepareStatement(sql);
			ResultSet rs=prep.executeQuery();
			while(rs.next())
			{
				users p1=new users();
				p1.id=rs.getInt("id");
				p1.name=rs.getString("name");
				p1.score=rs.getDouble("score");
				p1.rank=rs.getString("rank");
				users.add(p1);
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return users;
		}
}
