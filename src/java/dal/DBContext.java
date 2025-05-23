package dal;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
<<<<<<< HEAD

    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
 /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
        if (instance == null || instance.trim().isEmpty()) {
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
    /*Insert your other code right after this comment*/
 /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "localhost";
    private final String dbName = "SWP391_Project_Lastest";
    private final String portNumber = "1433";
    private final String instance = "";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final String userID = "sa";
    private final String password = "123";

    public static void main(String[] args) {
        try {
            System.out.println(new DBContext().getConnection());
        } catch (Exception e) {

=======
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
            String url = "jdbc:sqlserver://DESKTOP-6HNG787:1433;databaseName=KD;TrustServerCertificate=true;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
            connection = DriverManager.getConnection(url, user, password); 
>>>>>>> 3e4763491d5941464de8cc93e3bddf6bce653d8d
        }
    }
}
