package bankingapplication1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankingConnection {
    public static Connection connect(){
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, username, password);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BankingConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
}
