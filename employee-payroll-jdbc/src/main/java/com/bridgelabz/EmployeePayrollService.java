package com.bridgelabz;

import java.sql.Connection;
import java.sql.Statement;

public class EmployeePayrollService {

    public void updateEmployeeSalary() {

        try {

            Connection connection = DBConnection.getConnection();

            String query =
                    "UPDATE employee_payroll SET salary = 3000000 WHERE name = 'Terisa'";

            Statement statement = connection.createStatement();

            int rowsUpdated = statement.executeUpdate(query);

            System.out.println("Rows Updated : " + rowsUpdated);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        EmployeePayrollService service = new EmployeePayrollService();

        service.updateEmployeeSalary();
    }
}