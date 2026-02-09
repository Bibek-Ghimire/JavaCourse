package Java_JDBC.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {

    private static DbConfig instance;
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3307/javaDb";
    private static final String USER = "root";
    private static final String PASSWORD = "root123";

    private DbConfig() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Failed to connect to DB", e);
        }
    }

    public static synchronized DbConfig getInstance() {
        if (instance == null) {

            // Synchonization for thread safety

//            synchronized (DbConfig.class){
//                instance = new DbConfig();
//            }

            // this is not theread safe
            instance = new DbConfig();


        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
