
package connect;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnect {
    
    public static Connection getConnection()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pxostore", "root", "");
        } catch (ClassNotFoundException | SQLException e) 
        {
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        System.out.println(DBConnect.getConnection() );
    }
}

