SHOW DATABASES;
USE healthClinicDB;


--------------------------------------------------------------------------------------
-- STORED PROCEDURE OPERATIONS --
--------------------------------------------------------------------------------------

-- 1. Display all doctors 
DELIMITER $$
CREATE PROCEDURE getAllDoctors()
BEGIN
	SELECT * FROM doctor;
END $$
DELIMITER ;

CALL getAllDoctors();


-- 2. Find a Patient by Patient ID
DELIMITER $$
CREATE PROCEDURE getPatientById(IN id INT)
BEGIN
	SELECT * FROM patient
    WHERE patient_id = id;
END $$
DELIMITER ;

CALL getPatientById(11);


-- 3. Add a New Patient
DELIMITER $$
CREATE PROCEDURE addPatient(IN name VARCHAR(50), IN age INT, IN phone VARCHAR(15), IN address TEXT, IN dob DATE)
BEGIN	
    INSERT INTO patient
    (name, age, phone, address, dob)
	VALUES
    (name, age, phone, address, dob);
END $$
DELIMITER ;

CALL addPatient('Laxmi kumari', 21, '1010101010', 'Indore, MP', '2005-06-01');


-- 4. Update Appointment Status
DELIMITER $$
CREATE PROCEDURE updateAppointmentStatus(IN id INT, IN newStatus VARCHAR(20))
BEGIN
	UPDATE appointment
    SET status = newStatus
    WHERE appointment_id = id;
END $$
DELIMITER ;

CALL updateAppointmentStatus(64, 'Scheduled');


-- 5. Count Total Appointments for a Doctor
DELIMITER $$
CREATE PROCEDURE total_appointments_for_a_doctor(IN doctor_id INT)
BEGIN
	SELECT COUNT(*) AS total_appointments
    FROM appointment a
    JOIN doctor d
    ON a.doctor_id = d.doctorID
    WHERE doctorID = doctor_id;
END $$
DELIMITER ;

CALL total_appointments_for_a_doctor(3);
