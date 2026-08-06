package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Patient;

// In this class we will perform the CRUD Operations on the Patient tables
// DML Operations
public class PatientDao {
	
	// Insert a patient
	public void insertPatient(Patient patient) {
		String sql = "INSERT INTO patient (name, age, gender, phone, email, address) VALUES (?, ?, ?, ?, ?, ?)";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, patient.getName());
			ps.setInt(2, patient.getAge());
			ps.setString(3, patient.getGender());
			ps.setString(4, patient.getPhone());
			ps.setString(5, patient.getEmail());
			ps.setString(6, patient.getAddress());
			
			ps.executeUpdate();
			
			System.out.println("-- Patient added successfully --");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Update a patient
	public void updatePatient(int patientIdPatient, Patient patient) {
		String sql = "UPDATE patient SET name=?, age=?, gender=?, phone=?, email=?, address=? WHERE patient_id=?";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, patient.getName());
			ps.setInt(2, patient.getAge());
			ps.setString(3, patient.getGender());
			ps.setString(4, patient.getPhone());
			ps.setString(5, patient.getEmail());
			ps.setString(6, patient.getAddress());
			ps.setInt(7, patientIdPatient);
			
			ps.executeUpdate(); 
			
			System.out.println("-- Patient updated successfully --");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Delete a patient
	public void deletePatient(int patient_id) {
		String sql = "DELETE FROM patient WHERE patient_id=?";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setInt(1, patient_id); 
			ps.executeUpdate();
			
			System.out.println("-- Patient deleted successfully --");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Get a patient by id
	public Patient getPatientById(int patient_id) {
		String sql = "SELECT * FROM patient WHERE patient_id=?";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setInt(1, patient_id);
			ResultSet rs = ps.executeQuery(); 
			
			System.out.println("-- Patient details are --");
			
			while(rs.next()) {
				Patient patient = new Patient();
				
				patient.setPatient_id(rs.getInt("patient_id")); 
				patient.setName(rs.getString("name"));
				patient.setAge(rs.getInt("age"));
				patient.setGender(rs.getString("gender"));
				patient.setPhone(rs.getString("phone"));
				patient.setEmail(rs.getString("email"));
				patient.setAddress(rs.getString("address"));	
				
				return patient; 
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	} 
		
		
	// Get all patients
	public List<Patient> getAllPatients() {
		String sql = "SELECT * FROM patient;";
		List<Patient> patientList = new ArrayList<>(); 
		
		try(Connection conn = DBConnection.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql)) {
						
			System.out.println("-- Patients details are --");
			
			while(rs.next()) {
				Patient patient = new Patient();
				
				patient.setPatient_id(rs.getInt("patient_id")); 
				patient.setName(rs.getString("name"));
				patient.setAge(rs.getInt("age"));
				patient.setGender(rs.getString("gender"));
				patient.setPhone(rs.getString("phone"));
				patient.setEmail(rs.getString("email"));
				patient.setAddress(rs.getString("address"));	
				
				patientList.add(patient);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return patientList;
	}
}
