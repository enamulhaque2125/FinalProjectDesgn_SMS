
package com.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class MySQLConnector {
    public static Connection getConnection(){
        
            Connection conn  = null;
            
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementproject", "root", "123456");
            
            }catch(ClassNotFoundException | SQLException ex){
                
                JOptionPane.showMessageDialog(null, "Connection Failed.");
                
            }
            return conn;
    }
}
