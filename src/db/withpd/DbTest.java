package db.withpd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbTest {
	
	// 접속정보
	String host = "database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com";
	String port = "3306";
	String sid;
	String id;
	String pw;
	String driver = "com.mysql.cj.jdbc.Driver";
	
	Connection con = null;
	
	public DbTest() {
		
	}

	public DbTest(String id, String pw, String sid) {
		this.id = id;
		this.pw = pw;
		this.sid = sid;
	}
	
	public void connect() {
		
		try {
			Class.forName(driver);
			
			// 1. DB 접속
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			// jdbc:mysql://database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com:3306/geek9
			con = DriverManager.getConnection(url, id, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int delete(String condition) {
		
		// 실행할 쿼리(DELETE)
		String query = "DELETE FROM geek9.Test WHERE name = ?;";
		
		int result = 0;
		try {
			
			// 2. Delete Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, condition);
			result = pstmt.executeUpdate();
			
			// 3. 결과 확인
			System.out.println("결과 : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public int insert(String name, String phone, String addr) {
		
		// 실행할 쿼리(INSERT)
		String query = "INSERT INTO geek9.Test(name, phone, addr) VALUES(?, ?, ?)";
//		String query = "INSERT INTO geek9.Test(name, phone, addr) VALUES('" + name + "', '" + phone + "', '" + addr + "')";
		// 			   "INSERT INTO geek9.Test(name, phone, addr) VALUES('    배성호    ',     '1111    ', '     인천     ')"
		int result = 0;
		try {
		
			
			// 2. Insert Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			result = pstmt.executeUpdate();
			
			// 3. 결과 확인
			System.out.println("결과 : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public String select(String condition) {		// 성호
	
		condition = "%" + condition + "%";			// %성호%
		
		// 실행할 쿼리(SELECT)
		String query = "SELECT * FROM geek9.Test WHERE phone like ?" ;
		
		ResultSet rs = null;
		try {
			
			// 2. SELECT Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, condition);
			
			rs = pstmt.executeQuery();	// select
			
			// 3. 결과 확인
			while(rs.next()) {
				String name = rs.getString(1);
				String phone = rs.getString(2);
				String location = rs.getString(3);
				
				System.out.println("이름 : " + name);
				System.out.println("전화 : " + phone);
				System.out.println("지역 : " + location);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public int update(String oldVal, String newVal) {
		
		// 실행할 쿼리(UPDATE)
		String query = "UPDATE geek9.Test SET name=? where addr = ?;";
		
		int result = 0;
		try {
			
			// 2. UPDATE Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, newVal);
			pstmt.setString(2, oldVal);
			result = pstmt.executeUpdate();
			
			// 3. 결과 확인
			System.out.println("결과 : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] arg) {
		DbTest db = new DbTest("admin", "1234", "geek9");
		db.connect();		// 접속	
//		db.insert("영수", "100000", "대전");	// 이름/폰/주소
//		db.delete("배성호");
//		db.update("인천", "배성호");
		db.select("010");
	}
}
