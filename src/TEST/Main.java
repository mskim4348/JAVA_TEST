package TEST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;

		Statement stmt = null;

//		String url = "jdbc:oracle:thin:@localhost:1521/orcl";
		String url = "jdbc:oracle:thin:@192.168.1.22:1521/orcl";
		String id = "truitm";
		String pw = "truitm";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println(conn.isClosed()?"¿¬°á¾ÈµÊ":"¿¬°áµÊ");
			stmt = conn.createStatement();
			String SQL = "INSERT INTO TBL_A(A1, A2, A3) VALUES(5,5,5)";
			stmt.execute(SQL);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
