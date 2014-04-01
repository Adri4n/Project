package ak.property.organizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
//import sql and GUI components
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    
    //make a connection
    Connection conn = null;
    public static Connection ConnecrDB(){
        
        //Try to connect to the database
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\adrian\\Documents\\NetBeansProjects\\project123.sqlite");
            // pop up message saying "Connection established"
            JOptionPane.showMessageDialog(null, "Connection Established");
            //return the database
            return conn;
        }//catch the exception 
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        }
    }

