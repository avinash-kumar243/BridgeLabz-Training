package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Doctor;

// In this class we will perform the CRUD Operations over the Doctors
// DML Operations
public class DoctorDao {
	
	// Insert a doctor
	public void insertDoctor(Doctor doctor) {
		String sql = "INSERT INTO doctor (name, phone, email, fees, experience, department_id) VALUES (?, ?, ?, ?, ?, ?)";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, doctor.getName());
			ps.setString(2, doctor.getPhone());
			ps.setString(3, doctor.getEmail());
			ps.setDouble(4, doctor.getFees());
			ps.setInt(5, doctor.getExperience());
			ps.setInt(6, doctor.getSpecializationId()); 
			
			ps.executeUpdate(); 
			
			System.out.println("-- Doctor added successfully --");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Update a doctor by doctor_id
	public void updateDoctor(int doctorId, Doctor doctor) {
		String sql = "UPDATE doctor SET name=?, phone=?, email=?, fees=?, experience=?, department_id=? WHERE doctor_id=?";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, doctor.getName());
			ps.setString(2, doctor.getPhone());
			ps.setString(3, doctor.getEmail());
			ps.setDouble(4, doctor.getFees());
			ps.setInt(5, doctor.getExperience());
			ps.setInt(6, doctor.getSpecializationId()); 
			ps.setInt(7, doctorId);
			
			ps.executeUpdate(); 
			
			System.out.println("-- Doctor updated successfully --");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}	
	
	// Delete a doctor by doctor_id
	public void deleteDoctor(int doctor_id) {
		String sql = "DELETE FROM doctor WHERE doctor_id=?";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setInt(1, doctor_id); 
			ps.executeUpdate();
			
			System.out.println("-- Doctor deleted successfully --");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// Get a doctor by id
	public Doctor getDoctorById(int doctor_id) {
		String sql = "SELECT * FROM doctor WHERE doctor_id=?";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setInt(1, doctor_id);
			ResultSet rs = ps.executeQuery();
			
			System.out.println("-- Doctor details are --");
			
			while(rs.next()) {
				Doctor doctor = new Doctor();
				
				doctor.setDoctor_id(rs.getInt("doctor_id"));
				doctor.setName(rs.getString("name"));
				doctor.setPhone(rs.getString("phone"));
				doctor.setEmail(rs.getString("email"));
				doctor.setFees(rs.getDouble("fees"));
				doctor.setExperience(rs.getInt("experience"));
				doctor.setSpecializationId(rs.getInt("department_id"));
				
				return doctor;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	// Get all doctors
	public List<Doctor> getAllDoctors() {
		String sql = "SELECT * FROM doctor;";
		List<Doctor> doctorList = new ArrayList<>();
		
		try(Connection conn = DBConnection.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql)) {
			
			System.out.println("-- Doctors details are --");
			
			while(rs.next()) {
				Doctor doctor = new Doctor();
				
				doctor.setDoctor_id(rs.getInt("doctor_id"));
				doctor.setName(rs.getString("name"));
				doctor.setPhone(rs.getString("phone"));
				doctor.setEmail(rs.getString("email"));
				doctor.setFees(rs.getDouble("fees"));
				doctor.setExperience(rs.getInt("experience"));
				doctor.setSpecializationId(rs.getInt("department_id"));
				
				doctorList.add(doctor);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return doctorList;
	}
}