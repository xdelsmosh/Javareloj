/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.*;

public class Conexion {
    private Connection conn;
    private String url="jdbc:mysql://localhost:3306/db_tiendae";
    private String user="root";
    private String pass="root";

    public Conexion() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            System.err.print(e);
        }
    }
    public Connection getConnection(){
        return conn;
    }
    
    
}
