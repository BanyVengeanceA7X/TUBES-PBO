/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author muhasfk
 */
public class Koneksi {
      private static String servername="localhost";
    private static String username="root";
    private static String dbname="Reminder";
    private static int portnumber=3306;
    private static String password="root";
    
    public static Connection getConnection (){
        Connection cnx = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(" Get Connection" + Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
        return cnx;
    }
    
    public static void setData (String s) throws Exception{
        Koneksi.getConnection().createStatement().executeUpdate(s);
    }
    public static ResultSet getData(String sq) throws Exception{
        return Koneksi.getConnection().createStatement().executeQuery(sq);
    }
    
}

