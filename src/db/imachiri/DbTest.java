package db.imachiri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DbTest {
	
	//DB접속정보
//	String host = "database-1.cjn4qkg5yib7.us-east-2.rds.amazonaws.com";
	String host;
	String port;
	String sid;
	String driver;
//	String driver = "com.mysql.cj.jdbc.Driver";	

	// 사용자 정보 - 생성자 통해 받고 있음
	String id;
	String pw;
	
	Connection con = null;
	
	public DbTest() {
		
	}

	public DbTest(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void connect(String host, String port, String sid, String driver) {
		
		try {
			Class.forName(driver);
			
			// 1. DB 접속
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			con = DriverManager.getConnection(url, id, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public int delete(String condition) {
		
		// 실행할 쿼리(DELETE)
		String query = "DELETE FROM imachiri.IMACHIRI_TEST WHERE name = ?;";
		
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
		String query = "INSERT INTO imachiri.IMACHIRI_TEST(name, phone, addr) VALUES(?, ?, ?)";
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
	
	public  ArrayList<UserDto> select(String condition) {
	
		condition = "%" + condition + "%";
		
		// 실행할 쿼리(SELECT)
		String query = "SELECT * FROM imachiri.IMACHIRI_TEST WHERE phone like ?" ;
		
		ResultSet rs = null;
		ArrayList<UserDto> userList = new ArrayList<>();
	
		try {
			
			// 2. SELECT Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, condition);
			
			rs = pstmt.executeQuery();	// select
			
			// 3. 결과 확인
			while(rs.next()) {
				UserDto dto = new UserDto();

				String name = rs.getString(1);
				String phone = rs.getString(2);
				String location = rs.getString(3);

				dto.setName(name);
				dto.setPhone(phone);
				dto.setAddr(location);
				
				userList.add(dto);
				
//				System.out.println("이름 : " + name);
//				System.out.println("전화 : " + phone);
//				System.out.println("지역 : " + location);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	public int update(String oldVal, String newVal) {
		
		// 실행할 쿼리(UPDATE)
		String query = "UPDATE imachiri.IMACHIRI_TEST SET name=? where addr = ?;";
		
		int result = 0;
		try {
			
			// 2. UPDATE Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, newVal);
			pstmt.setString(2, oldVal);
			result = pstmt.executeUpdate();
			
			// 3. 결과 확인
//			System.out.println("결과 : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] arg) {
		DbTest db = new DbTest("admin", "Rornfl716!");
		db.connect("database-1.cjn4qkg5yib7.us-east-2.rds.amazonaws.com", "3306", "imachiri", "com.mysql.cj.jdbc.Driver");		// 접속	
//		db.insert("영수", "100000", "대전");	// 이름/폰/주소
//		db.delete("배성호");
//		db.update("인천", "배성호");
		ArrayList<UserDto> voList = db.select("0");
		
		int result = voList.size();
		System.out.println();
	}
}
