/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;


/**
 *
 * @author muhasfk
 */
public class Koneksi {
    private static Connection con;
        public static Connection getKoneksi(){
            String host = "jdbc:mysql://localhost/reminder",
                   user = "root",
                   ps   = "";
        try{
            con =(Connection) DriverManager.getConnection(host,user,ps);
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            System.out.println("Database dapat digunakan");
       
       }catch(SQLException err){
           JOptionPane.showMessageDialog(null, err.getMessage());
           System.out.println("Gagal");
       }
       return con;
    }
    
}