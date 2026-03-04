package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/payroll_service";

    private static final String USERNAME = "root";
    private static final String PASSWORD = "Pass@123";

    public static Connection getConnection() {

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("Database Connection Successful");

        } catch (SQLException e) {

            System.out.println("Connection Failed");
            e.printStackTrace();
        }

        return connection;
    }
}