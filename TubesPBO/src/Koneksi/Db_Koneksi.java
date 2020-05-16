/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author muhasfk
 */
public class Db_Koneksi {
      public static Connection conn;
    public static Connection getKoneksi(){
        String host = "jdbc:mysql://localhost/reminder",
               user = "root",
               pass = "root";
         try{
             conn = (Connection) DriverManager.getConnection(host, user, pass);
            
         }catch(SQLException ex){
             
         }
    return conn;
}

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showData(Connection Koneksil, String select) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close(Connection Koneksil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

