package Jdbc2;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/*
 * DAO는 싱글톤으로 만드는 것이 좋음
 * 
 * 1. Singleton & DB connection
 * 2. create - signUp
 * 3. retrieve - getUser, userInfo, findById, ..
 */
public class UserDAO {
	private  final String DBURL;
	private  final String DBUSER;
	private  final String DBPASSWORD;

	// 1. Singleton & DB connection
	private static UserDAO instance;
	private UserDAO() {
		// Properties 값 가져오기
		Properties props = new Properties();
		try(InputStream in  = ClassLoader.getSystemResourceAsStream("Jdbc2/db.properties");
				InputStreamReader reader = new InputStreamReader(in, StandardCharsets.UTF_8)){
			props.load(reader);
			DBURL = props.getProperty("DB.URL");
			DBUSER = props.getProperty("DB.USER");
			DBPASSWORD = props.getProperty("DB.PASSWORD");
		}catch(Exception e) {
			System.out.println("message:" + e.getMessage());
			throw new RuntimeException("접속정보가 없거나 잘못됨...");
		}
	}

	public static UserDAO getInstance() {
		if (instance == null) {
			instance = new UserDAO();
		}
		return instance;
	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
	}
	
	

	// 2. create - signUp
	public void signUp(User user) throws SQLException{
		String insertSQL = UserSQL.INSERT_USER;
		try (Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.setInt(5, user.getBirthYear());
			
			pstmt.executeUpdate();
		}
	}



	// 3. retrieve
	public User getUser(String username, String password) throws SQLException {
		String loginSQL = UserSQL.SELECT_USER;
		try (Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(loginSQL)) {

			pstmt.setString(1, username);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return new User(username, password, rs.getString("NAME"), rs.getString("EMAIL"),
						rs.getInt("BIRTH"));
			} 
		}
		throw new RuntimeException(MessageUtil.get("error.login.invalid"));
		// 임시로 시스템 에러메시지 확인을 위함.
//		return null;
	}

	public int updatePassword(String userName, String newPassword ) throws SQLException {
		String updateSQL = UserSQL.UPDATE_SQL;
		try (Connection conn =getConnection();
				PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

			pstmt.setString(1, newPassword);
			pstmt.setString(2, userName);

			return pstmt.executeUpdate();
		}
	}

	public int deleteUserData(String name) throws SQLException {
		String deleteSQL = UserSQL.DELETE_USER;
		try (Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {

			pstmt.setString(1, name);

			return pstmt.executeUpdate();
		}
	}

	public ResultSet getUserDetail(String username) throws SQLException {
		String searchSQL = UserSQL.SELECT_USERDETAIL;
		try (Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(searchSQL)) {

			pstmt.setString(1, username);

			ResultSet set = pstmt.executeQuery();
			
			System.out.println(set.getString("USERNAME"));
		
			return set;
		}
	}
}
