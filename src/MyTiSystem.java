import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MyTiSystem {
    public static void main(String[] args) {
        TestDatabase ob = new TestDatabase();
        ob.readDatabase();

        for (String i: ob.id_list) {
            System.out.println(i);
        }
    }
}
