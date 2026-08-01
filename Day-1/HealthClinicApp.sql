-- Health Clinic App

-- DDL Operations

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



-- DML Operations

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

SELECT doctorID, firstName, lastName, specialization 
FROM Doctor
WHERE specialization = 'Dentist';

-- Update a Doctor phone number
Update Doctor 
SET phone = '1010101010'
WHERE doctorID = 1;

-- Delete a Doctor details from db
DELETE FROM Doctor
WHERE doctorID = 1;