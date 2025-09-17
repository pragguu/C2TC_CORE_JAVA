package usingstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection cn;
	private static final String DB_DRIVER_CLASS="org.postgresql.Driver";
	private static final String DB_USERNAME="postgres";
	private static final String DB_PASSWORD="tiger";
	private static final String DB_URL="jdbc:postgresql://localhost:5432/student";
	
	public static Connection getConn()
	{
		try {
			Class.forName(DB_DRIVER_CLASS);
			System.out.println("Driver loaded successfully....");
			// connect to database
			cn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connection established successfully....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
}
