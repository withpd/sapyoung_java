package db.augreen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DbTest {
	
	//DB ��������
	String host;
	String port;
	String sid;
	String driver;
	
	// ����� ���� ->�����ڸ� ���� get
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
	
	
	
    public int insert(String name, String phone, String addr) {
    	
    	
    	
    	//������ ����(INSERT)
    	String query = "INSERT INTO augreen.SARI_TEST(name, phone, addr) VALUES(?, ?, ?)";
    	//String query = "INSERT INTO augreen.SARI_TEST(name, phone, addr) VALUES('" + name + "', '" + phone + "', '" + addr + "')";
		//String query = "INSERT INTO augreen.SARI_TEST(name, phone, addr) VALUES('���Ͽ�', '01022891851', '����')";	
    	int result = 0;
    	try {
			
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

    
    public int delete(String condition) {
      	
    	
    	//������ ����(DELETE)
    	String query = "DELETE FROM augreen.SARI_TEST WHERE name = ?;";
 
    	
    	int result = 0;
    	try {
			
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

    public int update(String oldVal, String newVal) {

    	
    	//������ ����(UDPDATE)
    	String query = "UPDATE augreen.SARI_TEST SET name =? where name = ?;"; 
 
    	
    	int result = 0;
    	try {
			
			
			// 2. update Query ����
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
    
    public ArrayList<UserDto> select(String condition) {     //5678
		
    	condition = "%" + condition + "%";       //%5678%
    	
    	//������ ����(SELECT)
    	String query = "SELECT * FROM augreen.SARI_TEST WHERE phone like ? ";
    	
    	ResultSet rs= null;
    	ArrayList<UserDto> userList = new ArrayList<>();
    	try { 
			
			
			// 2. Select Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, condition);
			
			rs = pstmt.executeQuery(); // select
			
			
			
			
			//3. ��� Ȯ��
			while(rs.next()) {
				UserDto dto = new UserDto();
				
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String location = rs.getString(4);
				
				dto.setName(name);
				dto.setPhone(phone);
				dto.setAddr(location);
				
				userList.add(dto);
				
//				System.out.println("�̸�: " + name);
//				System.out.println("��ȭ: " + phone);
//				System.out.println("����: " + location);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
    
    
    public static void main(String[] arg) {
    	DbTest db = new DbTest("admin", "sari&7322");
    	db.connect("database-1.corp9kafshqg.us-east-2.rds.amazonaws.com", "3306", "mysql", "com.mysql.cj.jdbc.Driver");  //����
//    	db.insert("������",  "010214530987", "����");
//    	db.delete("���Ͽ�");
//   	db.update("����", "������");
    	ArrayList<UserDto> voList = db.select("5678"); 
    	
    	int result = voList.size();
    	System.out.println(result + "��" );
    }
}
