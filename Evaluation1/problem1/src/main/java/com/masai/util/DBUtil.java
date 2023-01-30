package com.masai.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection()
    {
        String url
                = "jdbc:mysql://localhost:3306/universityDB";
        String username = "root";
        String password = "Mzakir@313";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection con = DriverManager.getConnection(
                        url, username, password);
                return con ;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
