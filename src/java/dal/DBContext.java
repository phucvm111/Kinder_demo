
package dal;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pc
 */
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
    } catch (Exception e) { 
        connection = null;
    }
}
    public static void main(String[] args) {
        DBContext dbContext = new DBContext();
        if (dbContext.connection != null) {
            System.out.println("Kết nối thành công với cơ sở dữ liệu!");
        } else {
            System.out.println("Kết nối thất bại!");
        }
    }

}