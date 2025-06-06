/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    static Connection conn = null;
    public static String url = "jdbc:mysql://localhost:3306/ces";
    public static String user = "root";
    public static String pass = "root";
    
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected to db: "+ url);
        } catch(ClassNotFoundException | SQLException ex){System.out.println("Failed to connect to database: \n "+ ex.getMessage());}
        return conn;
    }

}