package db.withpd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbTest {
	
	public int insert(String name, String phone, String addr) {
		
		// 접속정보
		String host = "database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "geek9";
		String id = "admin";
		String pw = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// 실행할 쿼리(INSERT)
		String query = "INSERT INTO geek9.Test(name, phone, addr) VALUES('" + name + "', '" + phone + "', '" + addr + "')";
		// 			   "INSERT INTO geek9.Test(name, phone, addr) VALUES('    배성호    ',     '1111    ', '     인천     ')"
		int result = 0;
		try {
			Class.forName(driver);
			
			// 1. DB 접속
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			// jdbc:mysql://database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com:3306/geek9
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
	
	public String select() {
		return "";
	}
	
	public int delete(String condition) {
		return 0;
	}
	
	public int update(String condition) {
		return 0;
	}
	
	public static void main(String[] arg) {
		DbTest db = new DbTest();
		db.insert("짱구", "123123412", "부산");	// 이름/폰/주소
	}
}
