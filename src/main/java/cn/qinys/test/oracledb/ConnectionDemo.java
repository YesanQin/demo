package cn.qinys.test.oracledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class ConnectionDemo {
	private static String str = "赵钱孙李周武郑王秦董郭张马刘习薄江吴陈";
	private static String named = "夫人之相与俯仰一世或取诸怀抱悟言一室之内或因寄所托放浪形骸之外虽趣舍万殊静躁不同当其欣于所遇暂得于己快然自足不知老之将至及其所之既倦情随事迁感慨系之矣向之所欣俯仰之间已为陈迹犹不能不以之兴怀况修短随化终期于尽古人云死生亦大矣岂不痛哉";
	private static String courses ="高等数学、线性代数、量子力学、声学、数学物理方法、传感器原理、纳米技术与应用、计算机原理与接口技术、C语言程序设计、毛泽东思想、数学物理方法、中国现代史、红楼梦赏析、数字电路基础、模拟电子技术";
	private static Connection conn = null;
	private static PreparedStatement prep = null;

	static {
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
//		produceStudentTable();
//		produceTeacherTable();
//		produceCourseTable();
//		produceScoreTable();
		String str = "afasfds";
		System.out.println(str.split("")[1]);
	}

	public static List<Integer> selectData(){
		try {
			prep = conn.prepareStatement("select t.id from tb_student t");
			ResultSet resultSet = prep.executeQuery();
			List<Integer> lsits =new ArrayList<Integer>();
			return new ArrayList<Integer>();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(prep != null){
				try {
					prep.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	public static void produceCourseTable(){
		try {
			prep = conn.prepareStatement("insert into tb_course values(seq_course.nextval,?,?)");
			for (int i = 0; i < 14; i++) {
				prep.setString(1, courses.split("、")[i]);
				prep.setInt(2,numberFactory());
				prep.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(prep != null){
				try {
					prep.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void produceScoreTable(){
		try {
			prep = conn.prepareStatement("insert into tb_score values(seq_score.nextval,?,?,?)");
			for (int i = 0; i < 50; i++) {
				prep.setInt(1, numberFactory());
				prep.setInt(2, numberFactory());
				prep.setInt(3, numberFactory());
				prep.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(prep != null){
				try {
					prep.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void produceTeacherTable(){
		try {
			prep = conn.prepareStatement("insert into tb_teacher values(seq_teacher.nextval,?)");
			for (int i = 0; i < 50; i++) {
				prep.setString(1, nameFactory());
				prep.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(prep != null){
				try {
					prep.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void produceStudentTable() {
		try {
			prep = conn.prepareStatement("insert into tb_student values(seq_student.nextval,?,?,?)");
			for (int i = 0; i < 10; i++) {
				prep.setString(1, nameFactory());
				prep.setInt(2, ageFactory());
				if (i % 3 == 0) {
					prep.setString(3, "女");
				} else {
					prep.setString(3, "男");
				}
				prep.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(prep != null){
				try {
					prep.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static String nameFactory() {
		Random random = new Random();
		int index = random.nextInt(19);
		int index2 = random.nextInt(115);
		int index3 = random.nextInt(115);
		String name = "";
		if (index3 % 7 == 0) {
			return "" + str.charAt(index) + named.charAt(index2 % 7);
		} else {
			return "" + str.charAt(index) + named.charAt(index2) + named.charAt(index3);
		}
	}

	public static int ageFactory() {
		Random random = new Random();
		int age = random.nextInt(15);
		return 20 + age;
	}
	public static String courseFactory(){
		Random random = new Random();
		int age = random.nextInt(courses.split("、").length);
		return courses.split("、")[age];
	}
	public static int numberFactory(){
		Random random = new Random();
		int number = random.nextInt(40);
		return number+1012;
	}
}
