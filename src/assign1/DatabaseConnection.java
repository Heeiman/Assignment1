package assign1;
import java.sql.*;


public class DatabaseConnection {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			
		} catch (Exception e) {System.out.println("Can not find database driver: " + e);
	      }
		
		String url = "jdbc:sqlserver://localhost:1433;database=Assignment1";
		String user = "app";
		String password = "app";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			
		} catch (SQLException e) { System.out.println("SQL Exception: " + e);
			
		}
	}

}
