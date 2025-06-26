package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest { 
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1"; 
    private static final String USER = "ace"; 
    private static final String PASSWORD = "ace"; 
 
    public static void main(String[] args) { 
    	try(Scanner sc = new Scanner(System.in)){
    		System.out.print("삭제할 유저 이름을 작성해주세요 > ");
    		String name = sc.next();
    		deleteData(name);
    	}catch(Exception e) {e.printStackTrace();}
        
    }
    
    public static void deleteData(String name) {
    	String deleteSQL = "DELETE EMP_TEMP WHERE LAST_NAME = ?"; 
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); 
             PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) { 
 
            pstmt.setString(1, name); 
 
            int rowsDeleted = pstmt.executeUpdate(); 
            if (rowsDeleted > 0) { 
                System.out.println("삭제 되었습니다!"); 
            } else { 
             System.out.println("삭제된 행이 없습니다."); 
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    }
} 