-- Implement ER Diagram

-- Employee Table
CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    phone VARCHAR(15),
    address VARCHAR(200),
    gender CHAR(1),
    start DATE
);

-- Department Table
CREATE TABLE department (
    dept_id INT AUTO_INCREMENT PRIMARY KEY,
    dept_name VARCHAR(50)
);

-- Employee_Department Table (Many-to-Many)
CREATE TABLE employee_department (
    emp_id INT,
    dept_id INT,
    FOREIGN KEY (emp_id) REFERENCES employee(id),
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);



