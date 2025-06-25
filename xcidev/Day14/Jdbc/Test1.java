package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {

			String username = null;
			int salary = 0;
			String jobId = null;
			double commissionPCT = 0.0;
			int departmentId = 0;

			System.out.println("사원 정보를 입력하세요 >");
			System.out.print("UserName :");
			username = scan.next();
			System.out.print("Salary :");
			salary = scan.nextInt();
			System.out.print("Job Id :");
			jobId = scan.next();
			System.out.print("CommissionPCT :");
			commissionPCT = scan.nextDouble();

			Map<Integer, String> departmentImfo = readDepartments();

			System.out.println("아래의 DepartmentId 종류 중 해당하는 ID값을 입력하세요");
			System.out.println("DepartmentId" + "\t" + "DepartmentName");
			for (Map.Entry<Integer, String> info : departmentImfo.entrySet()) {
				System.out.println(info.getKey() + "\t\t" + info.getValue());
			}

			System.out.print("DepartmentId :");
			departmentId = scan.nextInt();

			if (departmentImfo.containsKey(departmentId)) {
				inputEmpData(username, salary, jobId, commissionPCT, departmentId);
			} else {
				throw new SQLException("부서 정보가 잘못되었습니다.");
			}

		}catch(Exception e) {e.printStackTrace();}
	}

	public static void inputEmpData(String username, int salary, String jobId, double commissionPCT, int departmentId) {
		String insertSQL = """
				INSERT INTO
					emp_temp
					(LAST_NAME, SALARY, JOB_ID,COMMISSION_PCT,DEPARTMENT_ID)
				VALUES
					(?, ?, ?, ?, ?)
				""";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

				PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

			pstmt.setString(1, username);
			pstmt.setInt(2, salary);
			pstmt.setString(3, jobId);
			pstmt.setDouble(4, commissionPCT);
			pstmt.setInt(5, departmentId);

			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Map<Integer, String> readDepartments() {
		Map<Integer, String> departmentImfo = new HashMap<Integer, String>();

		String selectNameSQL = """
				Select
					department_id,
					department_name
				from
					departments
				""";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(selectNameSQL)) {

			while (rs.next()) {
				departmentImfo.put(rs.getInt("department_id"), rs.getString("department_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return departmentImfo;
	}
}
