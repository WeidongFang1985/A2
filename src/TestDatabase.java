import java.sql.*;
import java.util.ArrayList;

public class TestDatabase {
    public ArrayList<String> id_list = new ArrayList<>();
    public void readDatabase(){
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Database.db");

            System.out.println("Successfully connect to database");

            Statement statement = c.createStatement();

            ResultSet result = statement.executeQuery("select * from Account");

            while(result.next()) {
                String id = result.getString("id");
                String type = result.getString("type");
                String name = result.getString("name");
                String email = result.getString("email");
                id_list.add(id);
                // %d: integer, %s: string, %f: double/float, %.2f means display 2 decimal places
                System.out.printf("id: %s | name: %s | age: %s | address: %s\n", id, type, name, email);
            }

            result.close();
            statement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(c != null) {
            try {
                c.close();
                System.out.println("Close connection successfully.");
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
    }
}
