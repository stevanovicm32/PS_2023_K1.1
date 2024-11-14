/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Komunikacija {
    private static Komunikacija instance;
    private Connection connection;
    private Komunikacija(){
        try {
            String url="jdbc:mysql://localhost:3307/k1.1";
            connection=DriverManager.getConnection(url, "root","Masacar1.");
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Greska1");
        }
    }
    public static Komunikacija getInstance(){
        if(instance==null)
        {
            instance=new Komunikacija();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
}
