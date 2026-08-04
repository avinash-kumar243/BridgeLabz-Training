SHOW DATABASES;
USE healthClinicDB;


------------------------------------------------------------------------------------
-- TRIGGERS OPERATIONS --
------------------------------------------------------------------------------------

-- 1. A doctor's phone number must be exactly 10 digits. If not, stop the insertion.
DELIMITER $$
CREATE TRIGGER check_doctor_phone
BEFORE INSERT
ON doctor
FOR EACH ROW
BEGIN
	IF LENGTH(NEW.phone) <> 10 THEN 
		SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Phone number must be of exatly 10 digits';
	END IF;
END$$
DELIMITER ;

-- Correct :- Having exactly 10 digit of phone number
INSERT INTO doctor
(firstName, lastName, specialization, phone, email)
VALUES
('Gopal', 'kumar', 'Dentist', '0100001000', 'gopal@gmail.com');

-- Wrong :- Not having exactly 10 digit of phone number
INSERT INTO doctor
(firstName, lastName, specialization, phone, email)
VALUES
('Sachin', 'kumar sahu', 'Dentist', '44010100', 'sachin@gmail.com');


-- 2. Whenever a new patient is added, automatically save a log.
CREATE TABLE logs (
	log_id INT PRIMARY KEY AUTO_INCREMENT,
    message VARCHAR(50),
    created_on DATETIME DEFAULT CURRENT_TIMESTAMP
);

DELIMITER $$
CREATE TRIGGER update_log
AFTER INSERT
ON patient
FOR EACH ROW
BEGIN
	INSERT INTO logs
    (message)
    VALUES
    (CONCAT('New patient added', ': ', NEW.name));
END $$
DELIMITER ;

INSERT INTO patient(name, age, phone, address, dob)
VALUES
('Sundar',22,'01099539939','Patna','2003-02-10');

SELECT * FROM logs;
