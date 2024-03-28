/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebastockprojdbc;


import java.sql.*;
import java.util.logging.Logger;
/**
 *
 * @author Dann
 */
public class deleteStockProJDBC {
    

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    String usuario = "root";
    String password ="";
    String url = "jdbc:mysql://localhost:3306/usuarios";
    Connection conexion;
    Statement statement;
    ResultSet rs;   
    
    
        try {
            Class.forName("com.mysql.cj.jdbc.driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PruebaStockProJDBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();

            statement.executeUpdate ("Delete from usuarios where nombre = 'SOFIA'");
            
     
            rs = statement.executeQuery("select * from usuarios;"); 
            rs.next();
            do {
               System.out.println(rs.getInt("id")+" - "+rs.getString("nombre")+ " - "+rs.getString("apellido")+ " - "); 
            } while(rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(PruebaStockProJDBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
    }
    
}

