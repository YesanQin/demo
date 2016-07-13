package cn.qinys.test.oracledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class ConnectionDemo {
	private static String str ="赵钱孙李周武郑王秦董郭张马刘习薄江吴陈";
	private static String named = "京东云涉及到整个电子商务的全产业链建设和运营三步走的解决方案但对于企业数据依然是件奢侈品京东电商云事业部总经理任成元指出京东推出的京东万象平台通过数据搜集";
	private static Connection conn= null;
	
	static{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:qysorcl", "c##hao24sckf", "hao24sckf");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//			PreparedStatement prep = conn.prepareStatement("select * from tb_student");
			
			for(int i=0;i<510;i++){
//				prep.setInt(1, i+6);
				prep.setString(1, nameFactory());
				prep.setInt(2, ageFactory());
				if(i%3 ==0){
					prep.setString(3, "女");
				}else{
					prep.setString(3, "男");
				}
				prep.executeUpdate();
			}
			
//			ResultSet rst = prep.executeQuery();
//			while (rst.next()) {
//				String name = rst.getString("name");
//				System.out.println(name);
//			}
			
			//insert
			
//			System.out.println(nameFactory());
	}
	public static void produceStudentTable(){
		try {
			PreparedStatement prep = conn.prepareStatement("insert into tb_student values(seq_student.nextval,?,?,?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static String nameFactory(){
		Random random = new Random();
		int index = random.nextInt(19);
		int index2 = random.nextInt(71);
		int index3 = random.nextInt(71);
		String name ="";
		if(index3%7 == 0){
			return ""+str.charAt(index)+named.charAt(index2%7);
		}else{
			return ""+str.charAt(index)+named.charAt(index2)+named.charAt(index3);
		}
	}
	
	public static int ageFactory(){
		Random random = new Random();
		int age = random.nextInt(15);
		return 20+age;
	}
}
