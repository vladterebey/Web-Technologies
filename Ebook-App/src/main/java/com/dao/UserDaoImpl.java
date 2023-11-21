package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDaoImpl implements UserDao{
	
	private Connection conn;

	public UserDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	public UserDaoImpl() {
		super();
	}

	public UserDao setConnection(Connection connection) {
		this.conn = connection;
		return this;
	}

	@Override
	public boolean userRegister(User user) {
		boolean f=false;
		
		try {
			String sql = "insert into user(name, email, phone_number, password) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql); 
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhone_num());
			ps.setString(4, user.getPassword());
			
			int i = ps.executeUpdate();
			if (i==1)
			{
				f=true;
			}
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public User login(String email, String password) {
		User user = null;
		
		try {
			
			String sql = "select * from user where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPhone_num(rs.getString(4));
				user.setPassword(rs.getString(5));
				user.setCity(rs.getString(6));
				user.setPostcode(rs.getString(7));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	
	
	
}
