package db.withpd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbTest {
	
	public int delete(String condition) {
		// ��������
		String host = "database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "geek9";
		String id = "admin";
		String pw = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// ������ ����(DELETE)
		String query = "DELETE FROM geek9.Test WHERE name = ?;";
		
		int result = 0;
		try {
			Class.forName(driver);
			
			// 1. DB ����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			// jdbc:mysql://database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com:3306/geek9
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 2. Delete Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, condition);
			result = pstmt.executeUpdate();
			
			// 3. ��� Ȯ��
			System.out.println("��� : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public int insert(String name, String phone, String addr) {
		
		// ��������
		String host = "database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "geek9";
		String id = "admin";
		String pw = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// ������ ����(INSERT)
		String query = "INSERT INTO geek9.Test(name, phone, addr) VALUES(?, ?, ?)";
//		String query = "INSERT INTO geek9.Test(name, phone, addr) VALUES('" + name + "', '" + phone + "', '" + addr + "')";
		// 			   "INSERT INTO geek9.Test(name, phone, addr) VALUES('    �輺ȣ    ',     '1111    ', '     ��õ     ')"
		int result = 0;
		try {
			Class.forName(driver);
			
			// 1. DB ����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			// jdbc:mysql://database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com:3306/geek9
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 2. Insert Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			result = pstmt.executeUpdate();
			
			// 3. ��� Ȯ��
			System.out.println("��� : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public String select() {
		return "";
	}
	

	
	public int update(String oldVal, String newVal) {
		// ��������
		String host = "database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "geek9";
		String id = "admin";
		String pw = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// ������ ����(UPDATE)
		String query = "UPDATE geek9.Test SET name=? where addr = ?;";
		
		int result = 0;
		try {
			Class.forName(driver);
			
			// 1. DB ����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			// jdbc:mysql://database-1.cjvdgquniwjw.ap-northeast-2.rds.amazonaws.com:3306/geek9
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 2. UPDATE Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, newVal);
			pstmt.setString(2, oldVal);
			result = pstmt.executeUpdate();
			
			// 3. ��� Ȯ��
			System.out.println("��� : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] arg) {
		DbTest db = new DbTest();
		// db.insert("����", "100000", "����");	// �̸�/��/�ּ�
//		db.delete("�輺ȣ");
		db.update("��õ", "�輺ȣ");
		
	}
}
