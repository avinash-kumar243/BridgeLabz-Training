-- Health Clinic App

-- Create and Use HeathClinicDB Database
CREATE DATABASE healthClinicDB;
USE healthClinicDB;

-- Create a Doctor table
CREATE TABLE Doctor (
	doctorID INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(50) NOT NULL,
    lastName VARCHAR(50) NOT NULL,
    specialization VARCHAR(50) NOT NULL,
    phone VARCHAR(15) UNIQUE,
    createdOn DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- Add one more column to Doctor table
ALTER TABLE Doctor
ADD email VARCHAR(100) UNIQUE;

-- Insert data to the Doctor tables
INSERT INTO Doctor
(firstName, lastName, specialization, phone, email)
VALUES
('Avinash', 'kumar', 'Dentist', '1221212121', 'avinash123@gmail.com'),
('Akshay', 'kumar', 'Cardiologist', '2323232322', 'akshay003@gmail.com'),
('suraj', 'singh', 'General', '9949494944', 'suraj123@gmail.com'),
('Deepika', 'kumari', 'Dentist', '10003830000', 'deepika123@gmail.com'),
('deepak', 'thakur', 'Neurologist', '6664746464', 'deepak111@gmail.com');

-- Read Doctors details
SELECT * FROM Doctor;

-- Update a Doctor phone number
Update Doctor 
SET phone = '1010101010'
WHERE doctorID = 1;

-- Delete a Doctor details from db
DELETE FROM Doctor
WHERE doctorID = 1;


-- Create Patient Table 
CREATE TABLE patient (
	patient_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    phone VARCHAR(15),
    address TEXT,
    dob DATE
);

INSERT INTO patient (name, age, phone, address, dob) VALUES
('Deepak Kumar', 24, '9999999999', 'Patna, Bihar', '2002-05-05'),
('Khushi Sahu', 28, '9876543210', 'Ranchi, Jharkhand', '1998-04-28'),
('Shankar Patel', 22, '9994444400', 'Bhopal, Madhya Pradesh', '2004-12-12'),
('Anjali Gupta', 31, '9123456780', 'Lucknow, Uttar Pradesh', '1995-08-15'),
('Rohan Sharma', 35, '9012345678', 'Jaipur, Rajasthan', '1991-02-20'),
('Sneha Reddy', 27, '9988776655', 'Hyderabad, Telangana', '1999-09-10'),
('Vikram Joshi', 40, '9090909090', 'Pune, Maharashtra', '1986-11-25'),
('Pooja Mishra', 30, '9345678901', 'Varanasi, Uttar Pradesh', '1996-03-18'),
('Amit Yadav', 26, '9456123789', 'Kanpur, Uttar Pradesh', '2000-07-30'),
('Nisha Kapoor', 33, '9765432109', 'Delhi', '1993-01-12');

-- Create Appointment Table -- 
CREATE TABLE appointment (
	appointment_id INT PRIMARY KEY AUTO_INCREMENT,
    doctor_id INT NOT NULL,
    patient_id INT NOT NULL,
    appointment_date DATETIME NOT NULL,
    status VARCHAR(20) DEFAULT 'Scheduled',
    FOREIGN KEY (patient_id) REFERENCES patient(patient_id),
    FOREIGN KEY (doctor_id) REFERENCES doctor(doctorID)
);

INSERT INTO appointment
(doctor_id, patient_id, appointment_date, status)
VALUES
(2,1,'2026-08-05 10:00:00','Scheduled'),
(2,2,'2026-08-05 11:00:00','Pending'),
(3,3,'2026-08-06 10:30:00','Scheduled'),
(4,4,'2026-08-06 11:30:00','Pending'),
(5,5,'2026-08-07 09:00:00','Scheduled'),
(5,6,'2026-08-07 10:00:00','Pending');

SELECT * FROM patient;
SELECT * FROM doctor;
SELECT * FROM appointment;

SELECT p.name AS patient, d.firstName AS doctor, a.appointment_date
FROM appointment a
JOIN patient p ON a.patient_id = p.patient_id
JOIN doctor d  ON a.doctor_id  = d.doctorID
ORDER BY a.appointment_date;

-- Creating a bad appointment table
CREATE TABLE appointment_bad (
    appt_id           INT PRIMARY KEY AUTO_INCREMENT,
    patient_name      VARCHAR(100),
    patient_phone     VARCHAR(15),
    doctor_name       VARCHAR(100),
    doctor_specialty  VARCHAR(50),
    appt_date         DATETIME
);

INSERT INTO appointment_bad
(patient_name, patient_phone, doctor_name, doctor_specialty, appt_date) VALUES
('Ravi Kumar', '9876500000', 'Dr. Anita',  'Cardiology', '2026-08-05 10:00:00'),
('Ravi Kumar', '9876500000', 'Dr. Suresh', 'Orthopedic', '2026-08-06 11:30:00'),
('Meena S',    '9123400000', 'Dr. Anita',  'Cardiology', '2026-08-07 09:00:00');
    

UPDATE appointment_bad
SET patient_phone = '9999999999'
WHERE patient_name = 'Ravi Kumar';

UPDATE patient
SET phone = '9999999999'
WHERE name = 'Ravi Kumar';
SELECT ROW_COUNT();

ALTER TABLE doctor ADD COLUMN department_name VARCHAR(50);

UPDATE doctor SET department_name = 'Cardiology Dept' WHERE specialization = 'Cardiology';
UPDATE doctor SET department_name = 'Ortho Dept' WHERE specialization = 'Orthopedic';
SELECT * FROM doctor;

ALTER TABLE doctor DROP COLUMN department_name;

CREATE TABLE department (
    department_id   INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(50) NOT NULL
);

ALTER TABLE doctor ADD COLUMN department_id INT;
ALTER TABLE doctor ADD FOREIGN KEY (department_id) REFERENCES department(department_id);

INSERT INTO department (department_name) VALUES ('Cardiology Dept'), ('Ortho Dept');

UPDATE doctor SET department_id = 1 WHERE specialization = 'Cardiology';
UPDATE doctor SET department_id = 2 WHERE specialization = 'Orthopedic';

UPDATE department SET department_name = 'Cardiology Department' WHERE department_id = 1;
SELECT d.firstName, d.specialization, dep.department_name
FROM doctor d JOIN department dep ON d.department_id = dep.department_id;


DELIMITER $$
CREATE PROCEDURE seed_appointments(IN n INT)
BEGIN
    DECLARE i INT DEFAULT 0;
    WHILE i < n DO
        INSERT INTO appointment (patient_id, doctor_id, appointment_date, status)
        VALUES (
            1 + FLOOR(RAND() * 2),
            1 + FLOOR(RAND() * 2),
            DATE_ADD('2026-01-01', INTERVAL FLOOR(RAND()*365) DAY),
            'Scheduled'
        );
        SET i = i + 1;
    END WHILE;
END$$
DELIMITER ;

CALL seed_appointments(50000);

SELECT * FROM appointment WHERE patient_id = 1;

CREATE INDEX idx_appointment_patient ON appointment(patient_id);

SELECT * FROM appointment WHERE patient_id = 1;

SELECT * FROM appointment
WHERE doctor_id = 1 AND appointment_date > '2026-06-01';

CREATE INDEX idx_doctor_date ON appointment(doctor_id, appointment_date);

DROP TABLE IF EXISTS appointment_bad;
DROP PROCEDURE IF EXISTS seed_appointments;
DROP DATABASE health_clinic;


----------------------------------------------------------------------------------------
-- JOINS OPERATIONS --
----------------------------------------------------------------------------------------

-- 1. Display Patient Name, Doctor Name, Specialization, Appointment Date
SELECT p.name AS patient_name, CONCAT(d.firstName, ' ', lastName) AS doctor_name, d.specialization AS specialty, a.appointment_date AS appointment_date
FROM appointment a
JOIN doctor d ON d.doctorID = a.doctor_id
JOIN patient p ON p.patient_id = a.patient_id;


-- 2. Display All Doctors and Their Appointments (Even if no appointment exists)
SELECT CONCAT(d.firstName, ' ', d.lastName) AS doctor_name, d.specialization AS specialty, a.appointment_date AS appointment_date, a.status AS status
FROM doctor d
LEFT JOIN appointment a
ON a.doctor_id = d.doctorID;


-- 3. Display All Patients Who Have Appointments
SELECT p.name AS patient_name, CONCAT(d.firstName, ' ', d.lastName) AS doctor_name, a.appointment_date AS appointment_date
FROM doctor d
RIGHT JOIN appointment a
ON d.doctorID = a.doctor_id
JOIN patient p
ON a.patient_id = p.patient_id;


-- 4. Display Complete Appointment Details
SELECT a.appointment_id, p.name AS patient, CONCAT(d.firstName, ' ', d.lastName) AS doctor, d.specialization, a.appointment_date, a.status
FROM appointment a
JOIN patient p ON a.patient_id = p.patient_id
JOIN doctor d ON a.doctor_id = d.doctorID
ORDER BY a.appointment_date;


-- 5. Count Appointments for Each Doctor
SELECT CONCAT(d.firstName, ' ', d.lastName) AS doctor_name, COUNT(a.appointment_id) AS total_appointments
FROM doctor d
LEFT JOIN appointment a ON d.doctorID = a.doctor_id
GROUP BY d.doctorID, d.firstName, d.lastName;
