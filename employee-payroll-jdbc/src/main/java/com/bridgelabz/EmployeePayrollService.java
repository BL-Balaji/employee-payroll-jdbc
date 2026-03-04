package com.bridgelabz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeePayrollService {

    public void readEmployeePayrollData() {

        try {

            Connection connection = DBConnection.getConnection();

            String query = "SELECT * FROM employee_payroll";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");
                String startDate = resultSet.getString("start");

                System.out.println(id + " | " + name + " | " + salary + " | " + startDate);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        EmployeePayrollService service = new EmployeePayrollService();

        service.readEmployeePayrollData();
    }
}