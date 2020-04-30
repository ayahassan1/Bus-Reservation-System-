package mySQL;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Sec {
    private final String user = "root";
    private final String password = "";
    private final String address = "jdbc:mysql://localhost/BusTrackingSystem";
    
    public Connection connect() throws SQLException
    {
        return (Connection)DriverManager.getConnection(address,user,password);
    }
}
