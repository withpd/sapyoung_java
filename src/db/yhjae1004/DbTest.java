package db.yhjae1004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbTest {
	
	public String select( ) {
		
		return "";
	}
	
	public int insert(String name, String phone, String addr) {
		
		// 접속정보
		String host = "database-1.cijm7niylbmw.us-east-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "mysql";
		String id = "admin";
		String pw = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// 실행할 쿼리
		String query = "INSERT INTO heejaeyoo.YOO_TEST (NAME, PHONE, ADDR) VALUES('" + name + "', '" + phone + "', '" + addr + "')";
		// "INSERT INTO heejaeyoo.YOO_TEST (NAME, PHONE, ADDR) VALUES('최희선', '01012347890', '서울시')";
		
		
		int result = 0;
		try {
			Class.forName(driver);
			
			// 1. DB 접속
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 2. Insert Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			result = pstmt.executeUpdate();
			
			// 3. Insert 결과 확인
			System.out.println("결과 : " + result);
					
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
	
	public static void main(String[] args) {
		DbTest db = new DbTest();
		db.insert("송주원", "01022334455", "서울시"); // 이름, 휴대폰번호, 지역
	}
}
