package db.allende8505;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbTest {
	
	public String select () {
		return "";
	}
	
	public int insert (String name, String phone, String addr) {
		
		//접속정보
		String host = "database-1.czyeb5se0pkq.ap-northeast-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "mysql";
		String id = "admin";
		String pw = "**********";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//실행할 쿼리(INSERT)
		String query = "INSERT INTO allende8505db.ALLENDE8505_TEST(NAME, PHONE, ADDR) VALUES('박승환1', '02-499-93362', '서울시 성동구2')";
		
		int result = 0;
		try {
			Class.forName(driver);
			
			//1. DB접속
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			Connection con = DriverManager.getConnection(url, id, pw);
			
			//2. Insert Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			result = pstmt.executeUpdate();
			
			//3. 결과 확인
			System.out.println("결과: " + result);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete (String condition) {
		return 0;
	}
	
	public int updatet (String condition) {
		return 0;
	}
	
	public static void main(String[] args) {
		DbTest db = new DbTest();
		db.insert(null, null, null);
	}
	
}
