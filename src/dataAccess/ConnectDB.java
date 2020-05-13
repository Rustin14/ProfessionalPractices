/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ConnectDB
Date of creation: April 15th. 2020
*/
package dataAccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BRANDON TRUJILLO
 */
public class ConnectDB {
    private static String url = "jdbc:mysql://localhost:3306/propractices?serverTimezone=US/Central";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static String username = "root";
    private static String password = "Flipper10011";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException er) {
                System.out.println("Failed to create the database connection.");
                er.printStackTrace();
            }
        } catch (ClassNotFoundException clsEx) {
            System.out.println("Driver not found.");
        }
        return con;
    }

   public void closeConnection() {
       if (con != null){
           try {
               if(!con.isClosed()){
                   con.close();
               }
           }catch (SQLException exc){
               Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, exc);
           }
       }
   }
}


