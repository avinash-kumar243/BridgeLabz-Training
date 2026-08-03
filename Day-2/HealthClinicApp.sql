-- Health Clinic App -- 

-- Create and Use Health Clinic Database
CREATE DATABASE IF NOT EXISTS health_clinic;
USE health_clinic;

-- Create Doctor Table -- 
CREATE TABLE doctor (
	doctor_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    specialty VARCHAR(50),
    email VARCHAR(100) UNIQUE,
    experience INT NOT NULL
);

-- Create Patient Table -- 
CREATE TABLE patient (
	patient_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    phone VARCHAR(15),
    address TEXT,
    dob DATE
);

-- Create Appointment Table -- 
CREATE TABLE appointment (
	appointment_id INT PRIMARY KEY AUTO_INCREMENT,
    doctor_id INT NOT NULL,
    patient_id INT NOT NULL,
    appointment_date DATETIME NOT NULL,
    status VARCHAR(20) DEFAULT 'Scheduled',
    FOREIGN KEY (patient_id) REFERENCES patient(patient_id),
    FOREIGN KEY (doctor_id) REFERENCES doctor(doctor_id)
);

-- Insert data in doctor, patient, and appointment tables -- 
INSERT INTO doctor (name, specialty, email, experience) VALUES
('Dr. Avinash Kumar', 'Cardiologist', 'avinash@healthclinic.com', 12),
('Dr. Pratik Sharma', 'Orthopedic', 'pratik@healthclinic.com', 8),
('Dr. Suresh Mehta', 'Dermatologist', 'suresh@healthclinic.com', 15),
('Dr. Neha Verma', 'Pediatrician', 'neha@healthclinic.com', 10),
('Dr. Rahul Singh', 'Neurologist', 'rahul@healthclinic.com', 18),
('Dr. Priya Nair', 'Gynecologist', 'priya@healthclinic.com', 11);

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

INSERT INTO appointment (doctor_id, patient_id, appointment_date, status) VALUES
(1, 1, '2026-08-05 10:00:00', 'Scheduled'),
(1, 2, '2026-08-05 11:00:00', 'Pending'),
(2, 1, '2026-08-06 09:30:00', 'Scheduled'),
(3, 3, '2026-08-06 10:30:00', 'Scheduled'),
(4, 4, '2026-08-06 11:30:00', 'Pending'),
(5, 5, '2026-08-07 09:00:00', 'Scheduled'),
(6, 6, '2026-08-07 10:00:00', 'Pending'),
(2, 7, '2026-08-07 11:30:00', 'Pending'),
(3, 8, '2026-08-08 09:45:00', 'Scheduled'),
(1, 9, '2026-08-08 10:30:00', 'Pending'),
(5, 10, '2026-08-08 11:15:00', 'Scheduled'),
(4, 2, '2026-08-09 09:30:00', 'Scheduled'),
(6, 3, '2026-08-09 10:45:00', 'Pending'),
(1, 4, '2026-08-09 11:30:00', 'Scheduled'),
(3, 1, '2026-08-12 10:30:00', 'Scheduled');

SELECT * FROM doctor;
SELECT * FROM patient;
SELECT * FROM appointment;


-- Find all doctors and their specialty
SELECT name, specialty FROM doctor;

-- Find patients details whose name start with 'S';
SELECT * FROM patient
WHERE name LIKE 'S%';

-- Display all patients who are older by 30
SELECT * FROM patient
WHERE age > 30;

-- Find all patient who belongs to 'Uttar Pradesh'
SELECT * FROM patient
WHERE address LIKE '%Uttar Pradesh%';

-- Show all the doctors who had experience above 10 years
SELECT * FROM doctor
WHERE experience > 10;

-- Display all appointments sorted by appointment dates
SELECT * FROM appointment
ORDER BY appointment_date;

-- Count how many patient belongs to each state
SELECT address, COUNT(*) AS total_patients
FROM patient
GROUP BY address;

-- Show patient names along with their doctor's name and appointment status
SELECT p.name AS patient_name, d.name AS doctor_name, a.status
FROM appointment a
JOIN patient p ON a.patient_id = p.patient_id
JOIN doctor d ON a.doctor_id = d.doctor_id;

-- Show doctors who have more than 2 appointments
SELECT d.name, COUNT(a.appointment_id) AS total_appointments
FROM doctor d
JOIN appointment a ON d.doctor_id = a.doctor_id
GROUP BY d.doctor_id, d.name
HAVING COUNT(a.appointment_id) > 2;

-- Find all pending appointments
SELECT * FROM appointment
WHERE status = 'Pending';

-- Displaying the patient, doctor and their appointments by sorting appointments dates 
SELECT p.name AS patient, d.name AS doctor, a.appointment_date
FROM appointment a
JOIN patient p ON a.patient_id = p.patient_id
JOIN doctor d ON a.doctor_id = d.doctor_id
ORDER BY a.appointment_date;

-- All patient appointments for "Cardiologist"
SELECT p.name AS patient_name, p.phone AS patient_phone_no, d.name AS doctor_name
FROM patient p
JOIN appointment a ON p.patient_id = a.patient_id
JOIN doctor d ON d.doctor_id = a.doctor_id
WHERE d.specialty = 'Cardiologist'; 