package dal;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    private static DBContext instance = new DBContext();
    Connection connection;
    public static DBContext getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    public DBContext() {
    try {
        if (connection == null || connection.isClosed()) {
            String user = "sa";
            String password = "123";
            String url = "jdbc:sqlserver://HAIVT03\\SQLEXPRESS01:1433;TrustServerCertificate=true;"; 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
            connection = DriverManager.getConnection(url, user, password); 
        }
    }
}
