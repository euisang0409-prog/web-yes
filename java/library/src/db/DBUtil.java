package db;

import java.sql.Connection;
import java.sql.DriverManager;
//db 연결
public class DBUtil {

	// 접속경로
	private static String url =
			"jdbc:mysql://localhost:3306/rental_db";
	// 아이디
	private static String user = "root";
	// 비밀번호
	private static String password = "11111111";
	
	// 연결 객체를 반환하는 메서드
	public static Connection getConnection() throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection(url,user,password);
	}
	
}
