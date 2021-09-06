package db.clara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbTest {
	
	public String select() {
		
		return "";
	}
	
	public int insert(String name, String phone, String addr) {  //int눈 건수로 확인
		
		//접속정보
		String host ="database-1.czzmigv2nkha.us-east-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "lee";
		String id = "admin";
		String pw = "kmsk12!$";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//실행할 쿼리(INSERT)
		String query = "INSERT INTO lee.LEEAS (NAME, PHONE, ADDR) VALUES('이경희2', '01064164588', '강원');";
		
		int result = 0;
		
		try {
			Class.forName(driver);
			
			// 1. DB 접속
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			// jdbc:mysql://database-1.czzmigv2nkha.us-east-2.rds.amazonaws.com:3306/leeas
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 2. Insert Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			
			result = pstmt.executeUpdate();
			
			// 3. 결과 확인
			System.out.println("결과 : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	
	}
	
	public int delete(String condition) {
		
		return 0;
		
	}
	
	public int update(String condition) {

		return 0;
		
	}
	
	public static void main(String[] arg) {
		DbTest db = new DbTest ();
		db.insert(null, null, null);
		
	}
	
}
