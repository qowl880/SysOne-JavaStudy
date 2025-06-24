package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement; 
 
public class JdbcTest { 
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1"; 
    private static final String USER = "ace"; 
    private static final String PASSWORD = "ace"; 
 
    public static void main(String[] args) { 
        String selectSQL = 
        		"""
        		SELECT 
				    USERNAME,
				    KOR,
				    ENG,
				    MATH,
				    PHIL
        		FROM 
        			SCORE
        		"""; 
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(selectSQL)) { 
 
        	int sum = 0;
        	double avg = 0;
        	
            while (rs.next()) { 
                String username = rs.getString("USERNAME"); 
                int KOR = rs.getInt("KOR"); 
                int ENG = rs.getInt("ENG"); 
                int MATH = rs.getInt("MATH"); 
                int PHIL = rs.getInt("PHIL"); 
                
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount()-1;
                sum = KOR + ENG + MATH + PHIL;
                avg = (double)sum / columnCount;
                
                System.out.println("USERNAME: " + username + ", KOR: " + KOR +  
                                   ", ENG: " + ENG + ", MATH: " + MATH + 
                                   ", PHIL: " + PHIL + " 총점 : "+sum + " 평균 :" +avg);
                
            }
            
            
        } catch (SQLException e) { 
            e.printStackTrace(); 
} 
} 
}