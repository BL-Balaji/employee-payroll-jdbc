package com.bridgelabz;
import java.sql.Connection;

public class EmployeePayrollService {

    public static void main(String[] args) {

        Connection connection = DBConnection.getConnection();

        if (connection != null) {

            System.out.println("Connection Established Successfully");

        } else {

            System.out.println("Connection Failed");
        }
    }
}
