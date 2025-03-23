package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDBConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://mysql-grocery-store-student-66e7.f.aivencloud.com:28329/defaultdb?ssl-mode=REQUIRED";
        String user = "avnadmin";
        String password = "AVNS_yLsGi4zDxqP7zpfy6Eb";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Connect Success!");
            }
        } catch (Exception e) {
            System.out.println("Connect Faliure!");
            e.printStackTrace();
        }
    }
}
