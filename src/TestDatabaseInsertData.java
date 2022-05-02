//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class TestDatabaseInsertData {
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
//			Statement statement = c.createStatement();
//
//			String sql = "INSERT INTO Company (id, name, age, address, salary) VALUES (1, 'Paul',  32, 'California', 20000.00);";
//			statement.executeUpdate(sql);
//
//			sql = "INSERT INTO Company (id, name, age, address, salary) VALUES (2, 'Tim',  40, 'Melbourne', 40000.00);";
//			statement.executeUpdate(sql);
//
//			sql = "INSERT INTO Company (id, name, age, address, salary) VALUES (3, 'Alex', 20, 'Sydney', 35000.00);";
//			statement.executeUpdate(sql);
//
//			statement.close();
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
