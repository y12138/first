package com.hnjd.news.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DatabaseUtil.getConnection();
		
		//3.�����ݿ⽻��
		String sql ="select * from news_users where uname=? and upwd=?";
		PreparedStatement pst = null;
		ResultSet res = null;
		try {
			pst = connection.prepareStatement(sql);
			pst.setObject(1, "admin");
			pst.setObject(2, "admin");
			res = pst.executeQuery();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			while(res.next()) {
			
				System.out.println("�û���"+res.getString("uname")
							+"\t"
							+"���룺"+res.getString("upwd"));
			} 
		}catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		//4.�ͷ�����
		if(res!=null) {
			try {
				res.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}if(pst!=null) {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
