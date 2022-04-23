package org.example_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManageConnection {
    public ManageConnection() {                                                        //constructor
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getconnection(String url, String user, String password) {  //overload method
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

