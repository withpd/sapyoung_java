package db.allende8505;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DbTest {
	//DB��������
//	String host = "database-1.czyeb5se0pkq.ap-northeast-2.rds.amazonaws.com";
	String host;
	String port;
	String sid;
//	String driver = "com.mysql.cj.jdbc.Driver";
	String driver;
	
	//����� �������� -> ������ ���� get
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
			
			// 1. DB ����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			con = DriverManager.getConnection(url, id, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int delete (String condition) {
		//������ ����(DELETE)
		String query = "DELETE FROM allende8505db.ALLENDE8505_TEST WHERE name=?;";
		
		int result = 0;
		try {
			Class.forName(driver);
			
			//1. DB����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			Connection con = DriverManager.getConnection(url, id, pw);
			
			//2. Delete Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, condition);
			result = pstmt.executeUpdate();
			
			//3. ��� Ȯ��
//			System.out.println("���: " + result);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}
	
	
	public int insert (String name, String phone, String addr) {
		
		//������ ����(INSERT)
//		String query = "INSERT INTO allende8505db.ALLENDE8505_TEST(NAME, PHONE, ADDR) VALUES('" + name + "', '" + phone + "', '" + addr + "')";
		String query = "INSERT INTO allende8505db.ALLENDE8505_TEST(NAME, PHONE, ADDR) VALUES(?, ?, ?)";
		
		int result = 0;
		try {
			Class.forName(driver);
			
			//1. DB����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			Connection con = DriverManager.getConnection(url, id, pw);
			
			//2. Insert Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			result = pstmt.executeUpdate();
			
			//3. ��� Ȯ��
//			System.out.println("���: " + result);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public int update (String asisval, String tobeval) {
		
		//������ ����(UPDATE)
		String query = "UPDATE allende8505db.ALLENDE8505_TEST SET addr=? WHERE addr=?;";
		
		int result = 0;
		try {
			Class.forName(driver);
			
			//1. DB����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			Connection con = DriverManager.getConnection(url, id, pw);
			
			//2. Update Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, tobeval);
			pstmt.setString(2, asisval);
			result = pstmt.executeUpdate();
			
			//3. ��� Ȯ��
//			System.out.println("���: " + result);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return 0;
	}
	
	public ArrayList<UserDto> select (String condition) {
		condition = "%" + condition + "%";
		// ������ ����(SELECT)
		String query = "SELECT * FROM allende8505db.ALLENDE8505_TEST WHERE phone like ?" ;
		
		ResultSet rs = null;
		ArrayList<UserDto> userList = new ArrayList<>();
		try {
			
			// 2. SELECT Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, condition);
			
			rs = pstmt.executeQuery();	// select
			
			
			
			// 3. ��� Ȯ��
			while(rs.next()) {
				UserDto dto = new UserDto();
				
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String location = rs.getString(4);
				
				dto.setName(name);
				dto.setPhone(phone);
				dto.setAddr(location);
				
				userList.add(dto);
				
				
//				System.out.println("�̸� : " + name);
//				System.out.println("��ȭ : " + phone);
//				System.out.println("���� : " + location);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	public static void main(String[] args) {

		DbTest db = new DbTest("admin", "871125yh+");
		db.connect("database-1.czyeb5se0pkq.ap-northeast-2.rds.amazonaws.com", "3306", "mysql", "com.mysql.cj.jdbc.Driver");		// ����	
//		db.insert("����", "100000", "����");	// �̸�/��/�ּ�
//		db.delete("�輺ȣ");
//		db.update("��õ", "�輺ȣ");
		ArrayList<UserDto> voList = db.select("010");
		
		int result = voList.size();
		System.out.println(result + "��");
		
	}
	
}
