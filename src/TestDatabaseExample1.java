//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class TestDatabaseExample1 {
//
//	public static void main(String[] args) {
//
//		Connection c = null;
//
//		// load the sqlite driver to your program
//		try {
//			Class.forName("org.sqlite.JDBC");
//			c = DriverManager.getConnection("jdbc:sqlite:TestDB.db");
//
//			System.out.println("Successfully connect to database");
//
//			// display all tables in the database
//			ResultSet result = c.getMetaData().getTables(null, null, null, null); // null means no parameter required
//			while(result.next()) {
//				System.out.println(result.getString("TABLE_NAME"));
//			}
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		if(c != null) {
//			try {
//				c.close();
//				System.out.println("Close connection successfully.");
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}
