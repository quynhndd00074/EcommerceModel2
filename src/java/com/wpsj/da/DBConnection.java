/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wpsj.da;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





/**
 *
 * @author User
 */

public class DBConnection  {
    private static Connection connection;
    private Connection Connection;
    public Connection getConnection()throws ClassNotFoundException,
            SQLException{          
    if(connection == null)
    {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection = 
                DriverManager.getConnection("jdbc:derby://localhost:1527/Products",
                "sa", "1234");
    }
    return connection;
    }
    
}

    
