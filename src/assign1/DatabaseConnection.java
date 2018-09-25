package assign1;
import java.sql.Connection;


public class DatabaseConnection {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			
		} catch (Exception e) {System.out.println("Can not find database driver: " + e);
	      }
		
		String url = "jdbc:sqlserver://localhost:1433;database=Assignment1";
		String user = "app";
		String password = "123";
		try {
			DatabaseConnection con = DriverManager.getConnection(url, user, password);
		} catch (SQLExcpetion e) {
			
		}
	}

}
