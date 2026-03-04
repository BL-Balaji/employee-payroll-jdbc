-- Sum of salary by gender

SELECT SUM(salary) FROM employee_payroll
WHERE gender = 'F'
GROUP BY gender;

-- Average salary
SELECT avg(salary) FROM employee_payroll
group by gender;

-- Minimum salary
SELECT min(salary) FROM employee_payroll;

-- Maximum salary
SELECT max(salary) FROM employee_payroll;

-- Count employees
SELECT count(name) FROM employee_payroll
group by gender;