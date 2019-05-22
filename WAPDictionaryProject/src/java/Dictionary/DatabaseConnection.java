/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
/**
 *
 * @author Kadjal
 */
public class DatabaseConnection {
      public static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql:// localhost:3306/entries?useSSL=false"; 
        // Database name to access 
         
        String dbUsername = "root"; 
        String dbPassword = "admin"; 
  
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL, 
                                                     dbUsername,  
                                                     dbPassword); 
        return con; 
    } 
}
