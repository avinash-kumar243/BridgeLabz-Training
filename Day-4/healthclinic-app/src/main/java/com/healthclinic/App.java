package com.healthclinic;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

import com.healthclinic.dao.AppointmentDao;
import com.healthclinic.dao.DepartmentDao;
import com.healthclinic.dao.DoctorDao;
import com.healthclinic.dao.PatientDao;
import com.healthclinic.dao.StatsDao;
import com.healthclinic.model.Appointment;
import com.healthclinic.model.Department;
import com.healthclinic.model.Doctor;
import com.healthclinic.model.Patient;
import com.healthclinic.model.Stats;

public class App {
	
	static Scanner sc = new Scanner(System.in);

    public static void main( String[] args ) {    
    	
    		DoctorDao doctorDao = new DoctorDao();
    		PatientDao patientDao = new PatientDao();
    		AppointmentDao appointmentDao = new AppointmentDao();
    		DepartmentDao departmentDao = new DepartmentDao();
    		StatsDao statsDao = new StatsDao();
    		
    		
    		int choice = 0;
    		
    		while(true) {
    			System.out.println("\n========== HEALTH CLINIC APP ==========");
    			System.out.println("1. Patient Operations");
    			System.out.println("2. Doctor Operations");
    			System.out.println("3. Appointment Operations");
    			System.out.println("4. Department Operations");
    			System.out.println("5. Stats Operations");
    			System.out.println("6. Exit");

    			System.out.print("\nEnter your choice : ");
    			choice = sc.nextInt(); 
    			
    			switch(choice) {
    				case 1: 
    					patientMenu(patientDao); 
    					break;
    					
    				case 2: 
    					doctorMenu(doctorDao); 
    					break;
    					
    				case 3: 
    					appointmentMenu(appointmentDao);
    					break;
    					
    				case 4: 
    					departmentMenu(departmentDao);
    					break;
    					
    				case 5:
    					statsMenu(statsDao);
    					break;
    					
    				case 6:
    					System.out.println("Thank you");
    					return;
    					
    				default:
    					System.out.println("Invalid choice!!!");
    			}

    		}
    }
    
    
    private static void statsMenu(StatsDao statsDao) {

        int choice = 0;

        do {
            System.out.println("\n------ Statistics Menu ------");
            System.out.println("1. View one Doctor Stats");
            System.out.println("2. View All Doctors Stats");
            System.out.println("3. Back");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            int doctorId;

            switch (choice) {
                case 1:
                    System.out.print("Enter Doctor ID: ");
                    doctorId = sc.nextInt();

                    System.out.println(statsDao.getStatsByDoctorId(doctorId));
                    break;

                case 2:
                    List<Stats> statsList = statsDao.getAllDoctorStats();
                    for(Stats stats : statsList) {
                        System.out.println(stats);
                    }
                    break; 

                default:
                    System.out.println("Invalid Choice!");
            }
        } while(choice != 3);
    }
    
    private static void departmentMenu(DepartmentDao departmentDao) {

        int choice = 0;

        do {
            System.out.println("\n------ Department Menu Operations ------");
            System.out.println("1. Add Department");
            System.out.println("2. Update Department");
            System.out.println("3. Delete Department");
            System.out.println("4. View one Department");
            System.out.println("5. View all Departments");
            System.out.println("6. Back");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            int departmentId = 0;

            switch (choice) {
                case 1:
                    departmentDao.insertDepartment(getDepartmentDetails());
                    break;

                case 2:
                		System.out.println("Enter department id: ");
					departmentId = sc.nextInt();
					sc.nextLine();
					
                    departmentDao.updateDepartment(departmentId, getDepartmentDetails());
                    break;

                case 3:
                    System.out.print("Enter Department ID: ");
                    departmentId = sc.nextInt();

                    departmentDao.deleteDepartment(departmentId);
                    break;

                case 4:
                    System.out.print("Enter Department ID: ");
                    departmentId = sc.nextInt();

                    System.out.println(departmentDao.getDepartmentById(departmentId));
                    break;

                case 5:
                    List<Department> departmentList = departmentDao.getAllDepartments();

                    for(Department department : departmentList) {
                        System.out.println(department);
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
    
    
    private static void patientMenu(PatientDao patientDao) {
    	
    		int choice = 0;

		do {
			System.out.println("\n------ Patient Menu Operations ------");
			System.out.println("1. Add Patient");
			System.out.println("2. Update Patient");
			System.out.println("3. Delete Patient");
			System.out.println("4. Get patient by id");
			System.out.println("5. Get all patients");
			System.out.println("6. Back");

			System.out.print("Enter Your Choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			int patientId = 0;  

			switch(choice) {
				case 1:
					patientDao.insertPatient(getPatientDetails()); 
					break;
				
				case 2:
					System.out.println("Enter patient id: ");
					patientId = sc.nextInt();
					sc.nextLine();
					
					patientDao.updatePatient(patientId, getPatientDetails()); 
					break;
				
				case 3:
					System.out.println("Enter patient id: ");
					patientId = sc.nextInt();
					
					patientDao.deletePatient(patientId);
					
					break;
				
				case 4: 
					System.out.println("Enter patient id: ");
					patientId = sc.nextInt();
					
					System.out.println(patientDao.getPatientById(patientId));
					break;
					
				case 5: 
					List<Patient> patientList = patientDao.getAllPatients();
					for(Patient patient : patientList) {
						System.out.println(patient);
					}
					break;
	
				default:
					System.out.println("Invalid Choice!"); 
			}

		} while (choice != 6);
	}
    
    
    private static void doctorMenu(DoctorDao doctorDao) {

        int choice = 0;

        do {
            System.out.println("\n------ Doctor Menu Operations ------");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. View one Doctor");
            System.out.println("5. View all Doctors");
            System.out.println("6. Back");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
			
            int doctorId = 0;
            
            switch(choice) {

                case 1:
                    doctorDao.insertDoctor(getDoctorDetails());
                    break;

                case 2:
                		System.out.println("Enter doctor id: ");
					doctorId = sc.nextInt();
					sc.nextLine();
					
                    doctorDao.updateDoctor(doctorId, getDoctorDetails());
                    break;

                case 3:
                    System.out.print("Enter Doctor ID: ");
                    doctorId = sc.nextInt();

                    doctorDao.deleteDoctor(doctorId);
                    break;

                case 4:
                    System.out.print("Enter Doctor ID: ");
                    doctorId = sc.nextInt();

                    System.out.println(doctorDao.getDoctorById(doctorId));
                    break;

                case 5:
                    List<Doctor> doctorList = doctorDao.getAllDoctors();

                    for(Doctor doctor : doctorList) {
                        System.out.println(doctor);
                    }
                    break; 

                case 6:
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
    
    
    private static void appointmentMenu(AppointmentDao appointmentDao) {
        int choice = 0;

        do {
            System.out.println("\n------ Appointment Menu Operations ------");
            System.out.println("1. Add Appointment");
            System.out.println("2. Update Appointment");
            System.out.println("3. Delete Appointment");
            System.out.println("4. View one Appointment");
            System.out.println("5. View all Appointments");
            System.out.println("6. Back");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            int appointmentId = 0;

            switch (choice) {

                case 1:
                    appointmentDao.insertAppointment(getAppointmentDetails());
                    break;

                case 2:
                		System.out.println("Enter patient id: ");
					appointmentId = sc.nextInt();
					sc.nextLine();
					
                    appointmentDao.updateAppointment(appointmentId, getAppointmentDetails());
                    break;

                case 3:
                    System.out.print("Enter Appointment ID: ");
                    appointmentId = sc.nextInt();

                    appointmentDao.deleteAppointment(appointmentId);
                    break;

                case 4:
                    System.out.print("Enter Appointment ID: ");
                    appointmentId = sc.nextInt();

                    System.out.println(appointmentDao.getAppointmentById(appointmentId));
                    break;

                case 5:
                    List<Appointment> appointmentList = appointmentDao.getAllAppointments();
                    for(Appointment appointment : appointmentList) {
                        System.out.println(appointment);
                    }
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 6);
    }
    
    
    // Helper method
    public static Appointment getAppointmentDetails() {
        Appointment appointment = new Appointment();

        System.out.print("Enter Doctor ID: ");
        appointment.setDoctorId(sc.nextInt());
        System.out.print("Enter Patient ID: ");
        appointment.setPatientId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Appointment Time (yyyy-MM-dd HH:mm:ss): ");
        appointment.setAppointmentTime(Timestamp.valueOf(sc.nextLine()));
        System.out.print("Enter Status: ");
        appointment.setStatus(sc.nextLine());
        System.out.print("Enter Diagnosis: ");
        appointment.setDiagnosis(sc.nextLine());

        return appointment;
    }
    
    // helper method
    public static Patient getPatientDetails() { 
        Patient patient = new Patient();

        System.out.print("Enter Patient Name: ");
        patient.setName(sc.nextLine());
        System.out.print("Enter Patient Age: ");
        patient.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Patient Gender: ");
        patient.setGender(sc.nextLine());
        System.out.print("Enter Patient Phone: ");
        patient.setPhone(sc.nextLine());
        System.out.print("Enter Patient Email: ");
        patient.setEmail(sc.nextLine());
        System.out.print("Enter Patient Address: ");
        patient.setAddress(sc.nextLine());

        return patient;
    }
    
    // Helper method
    public static Doctor getDoctorDetails() { 
        Doctor doctor = new Doctor();

        System.out.print("Enter Doctor Name: ");
        doctor.setName(sc.nextLine());
        System.out.print("Enter Doctor Phone: ");
        doctor.setPhone(sc.nextLine());
        System.out.print("Enter Doctor Email: ");
        doctor.setEmail(sc.nextLine());
        System.out.print("Enter Consultation Fees: ");
        doctor.setFees(sc.nextDouble());
        System.out.print("Enter Experience (in years): ");
        doctor.setExperience(sc.nextInt());
        System.out.print("Enter Department ID: ");
        doctor.setSpecializationId(sc.nextInt());
        sc.nextLine();

        return doctor;
    }

    // Helper method
    public static Department getDepartmentDetails() {
        Department department = new Department();

        System.out.print("Enter Department Name: ");
        department.setDepartmentName(sc.nextLine());

        return department; 
    }
}








// For Every operation, every time "---------- Database connected successfully -----------" will be print. Because my every methods inside my dao layer is making a database connection by "Connection conn = DBConnection.getConnection()"
// So, for everytime, message will be printed.
    		