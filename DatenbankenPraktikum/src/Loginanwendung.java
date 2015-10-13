import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Loginanwendung {
	
	//Klassenvariablen in denen die Logininformationen zur Datenbank gespeichert werden.
	private final String databaseUserName = "DB_PR2015_02_01";
	private final String databaseUserPassword = "Test123!";
	private final String dataBaseUrl = "jdbc:sqlserver://sqlserver.informatik.uni-mainz.de;" +
	         "databaseName=DB_PR2015_02";
	
	
	public String[] login(String userName, String userPassword, String rolle) {
		String[] loginData = null;
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 conn = DriverManager.getConnection(dataBaseUrl, databaseUserName, databaseUserPassword);
			 loginData = ExecutionHelper.loginDatabase(conn, userName ,  userPassword, rolle);
			 conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			   if (rs != null) try { rs.close(); } catch(Exception e) {}
			   if (stmt != null) try { stmt.close(); } catch(Exception e) {}
			   if (conn != null) try { conn.close(); } catch(Exception e) {}
		}
	return loginData;
	}
}
