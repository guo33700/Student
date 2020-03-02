package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButils {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//获得连接的方法
	private static Connection conn = null;
	private static Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanger?useUnicode=true&"
					+ "characterEncoding=UTF-8","root", "1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//释放资源的方法
	public static void closeAll(ResultSet re,PreparedStatement pr,Connection conn) {
		
			try {
				if(re!=null) {
				re.close();
				}
				if(pr!=null) {
					pr.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	//增改删的方法
	public static int updateAll(String sql,Object ...params) {
		PreparedStatement pr = null;
		try {
			conn = getConnection();
			pr = conn.prepareStatement(sql);
			if(params != null) {
				for(int i = 0;i<params.length;i++) {
					pr.setObject(i+1, params[i]);
				}
				return pr.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(null, pr, conn);
		}
		return 0;
	}
	//通用查询的方法
	public static ResultSet queryAll(String sql,Object ...params) {
		ResultSet re = null;
		PreparedStatement pr = null;
		try {
		conn = getConnection();
		pr = conn.prepareStatement(sql);
		if(params != null) {
			for (int i = 0; i < params.length; i++) {
				pr.setObject(i+1, params[i]);
			}
		}
		re = pr.executeQuery();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return re;
	}
}
