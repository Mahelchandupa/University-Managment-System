/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    static  Connection con = null;
    
    @SuppressWarnings("CallToPrintStackTrace")
    public static Connection getConnection(){
       try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagmentdb","root","");
       }  
       catch(ClassNotFoundException | SQLException e){
           e.printStackTrace();
       }
       return con; 
    }
}
