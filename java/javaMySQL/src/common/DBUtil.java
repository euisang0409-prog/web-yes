package common;

import java.sql.Connection;
import java.sql.DriverManager;

// db ¿¬°á
public class DBUtil {

    private static String url =
        "jdbc:mysql://localhost:3306/java_db";

    private static String user = "root";

    private static String password = "11111111";

    public static Connection getConnection() {

        try {

            Connection conn =
                DriverManager.getConnection(url, user, password);

            return conn;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }
}