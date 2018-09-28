package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:postgresql://localhost:5433/infop";
    private static final String USER = "postgres";
    private static String PASSWORD ="";

    public static Connection getConnection(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (SQLException e){
            throw new RuntimeException("Connection to DB is abort ",e);
        }
    }

    public static void setPASSWORD(String PASSWORD) {
        ConnectionFactory.PASSWORD = PASSWORD;
    }
}
