ALTER TABLE employee_payroll
ADD phone VARCHAR(15),
ADD address VARCHAR(200) DEFAULT 'India',
ADD department VARCHAR(50) NOT NULL;

SELECT * FROM employee_payroll;