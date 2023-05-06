package testlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class LoginDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";

	private String className = OracleDriver.class.getName();

	public LoginDAO() {
		try {
			Class.forName(className);
			} catch(ClassNotFoundException e) {
				System.err.println("DAO 생성자 예외 발생: " + e);
		}
		
	}
	
	public int insert(LoginDTO dto) {
		int row = 0;
		// 이 변수는 쿼리 실행 후에 몇 개의 row가 추가, 수정, 삭제 되었는지를 저장하기 위해 사용
		String sql = "insert into login values(?, ?, ?)";
		try {
			conn = DriverManager.getConnection(url, user, password);
			// drivermanager를 이용해 db와 연결하기 위한 정보
			pstmt = conn.prepareStatement(sql);
			// 연결된 connection 객체를 사용해 prepareStatement 객체를 생성, 이때 sql을 인자로 넣어줌
			// 한 번 생성하면 계속 쓸 수 있음 
			pstmt.setString(1, dto.getId());
			pstmt.setInt(2, dto.getPw());
			pstmt.setString(3, dto.getnickName());
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try { if(rs != null) 	rs.close(); 	} 	catch(Exception e) {}
			try { if(pstmt != null) pstmt.close(); 	} 	catch(Exception e) {}
			try { if(conn != null) 	conn.close(); 	} 	catch(Exception e) {}
		}
		return row;
	}
	
	public LoginDTO loginId(String id) {
	    LoginDTO dto = null;
	    String sql = "select * from login where id = ?";
	    try {
	        conn = DriverManager.getConnection(url, user, password);
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, id);
	        rs = pstmt.executeQuery();
	        if (rs.next()) {
	            dto = new LoginDTO();
	            dto.setId(rs.getString("id"));
	            dto.setPw(rs.getInt("pw"));
	            dto.setnickName(rs.getString("nickname"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try { if(rs != null) 	rs.close(); 	} 	catch(Exception e) {}
	        try { if(pstmt != null) pstmt.close(); 	} 	catch(Exception e) {}
	        try { if(conn != null) 	conn.close(); 	} 	catch(Exception e) {}
	    }
	    return dto;
	}

	public int update(String newId, int newPw, String newnickName, String inputId) {
		int row = 0;
		String sql = "update login set id = ?, pw = ?, nickname =? where id =? ";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newId);
			pstmt.setInt(2, newPw);
			pstmt.setString(3, newnickName);
			pstmt.setString(4, inputId);
			
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try { if(rs != null) 	rs.close(); 	} 	catch(Exception e) {}
			try { if(pstmt != null) pstmt.close(); 	} 	catch(Exception e) {}
			try { if(conn != null) 	conn.close(); 	} 	catch(Exception e) {}
		}
		return row;
	}
	
	public int delete(String id) {
		int row = 0;
		String sql = "delete from login where id = ?";
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try { if(rs != null) 	rs.close(); 	} 	catch(Exception e) {}
			try { if(pstmt != null) pstmt.close(); 	} 	catch(Exception e) {}
			try { if(conn != null) 	conn.close(); 	} 	catch(Exception e) {}
		}
		return row;
		
	}
}

	

