 -- Find salary of Bill
SELECT salary FROM employee_payroll
WHERE name = "Bill";

-- Find employees between date range
SELECT * FROM employee_payroll
WHERE start between cast('2018-01-01' as date) AND DATE(now());