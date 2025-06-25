package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class XCI2LoginInjectionExample {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String inputUsername = sc.nextLine();
		System.out.print("pw : ");
		String inputPassword = sc.nextLine();

		String loginSQL = "SELECT NAME FROM XCI_MEMBERS " + "WHERE  USERNAME = '" + inputUsername + "' "
				+ "AND    PASSWORD = '" + inputPassword + "'";

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(loginSQL)) {

			if (rs.next()) {		// 만약 해당 부분에서 에러 발생시 제일 바깥쪽에 있는 catch에서 잡아줌
				System.out.println("로그인 성공 : " + rs.getString("NAME"));		
			} else {
				System.out.println("아이디 혹은 패스워드가 틀립니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 현재 장원영의 id : z10 / pw : z10이다.
	 * 이때, id값에 z10'--를 입력하게 되면 db에서는  --을 주석처리를 하고 있기 때문에
	 * id : z10'--  pw : qwer를 입력하게 되더라도  -- pw :qwer로 인식이 되어 id : z10인 값인 장원영이 출력이 된다.
	 * 즉, 비밀번호 없이 유저 정보를 찾아올수 있는데 이것이 SQL Injection 탈취 방법이다.
	 */
}