package cn.qinys.test.oracledb;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:qysorcl", "c##hao24sckf", "hao24sckf");

//			PreparedStatement prep = conn.prepareStatement("select * from dim_zw ");
//
//			ResultSet rst = prep.executeQuery();
//			while (rst.next()) {
//				String name = rst.getString("zw_mc");
//				System.out.println(name);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
