package com.healthclinic.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Appointment;

// Stored procedure code is written inside workbench, and calling by here
public class StoredProcedureDao {
	
	// Get appointments by doctor ID
	public List<Appointment> getAppointmentsByDoctorIdProcedure(int doctorId) {
	    String sql = "{CALL get_appointments_by_doctor(?)}";

	    List<Appointment> appointmentList = new ArrayList<>();

	    try(Connection conn = DBConnection.getConnection();
	        CallableStatement cs = conn.prepareCall(sql)) {

	        cs.setInt(1, doctorId);

	        ResultSet rs = cs.executeQuery();

	        while(rs.next()) {
	            Appointment appointment = new Appointment();

	            appointment.setAppointmentId(rs.getInt("appointment_id"));
	            appointment.setDoctorId(rs.getInt("doctor_id"));
	            appointment.setPatientId(rs.getInt("patient_id"));
	            appointment.setAppointmentTime(rs.getTimestamp("appointment_time"));
	            appointment.setStatus(rs.getString("status"));
	            appointment.setDiagnosis(rs.getString("diagnosis"));

	            appointmentList.add(appointment);
	        } 
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }
	    return appointmentList;
	}
	
	
	// Get appointments by patient ID
	public List<Appointment> getAppointmentsByPatientIdProcedure(int patientId) {
	    String sql = "{CALL get_appointments_by_patient(?)}";

	    List<Appointment> appointmentList = new ArrayList<>();

	    try(Connection conn = DBConnection.getConnection();
	        CallableStatement cs = conn.prepareCall(sql)) {

	        cs.setInt(1, patientId);

	        ResultSet rs = cs.executeQuery();

	        while(rs.next()) {
	            Appointment appointment = new Appointment();

	            appointment.setAppointmentId(rs.getInt("appointment_id"));
	            appointment.setDoctorId(rs.getInt("doctor_id"));
	            appointment.setPatientId(rs.getInt("patient_id"));
	            appointment.setAppointmentTime(rs.getTimestamp("appointment_time"));
	            appointment.setStatus(rs.getString("status"));
	            appointment.setDiagnosis(rs.getString("diagnosis"));

	            appointmentList.add(appointment);
	        }

	    } catch(SQLException e) {
	        e.printStackTrace();
	    }
	    return appointmentList;
	}
	
	
	// Get appointment status
	public List<Appointment> getAppointmentsByStatusProcedure(String status) {
	    String sql = "{CALL get_appointments_by_status(?)}";

	    List<Appointment> appointmentList = new ArrayList<>();

	    try(Connection conn = DBConnection.getConnection();
	        CallableStatement cs = conn.prepareCall(sql)) {

	        cs.setString(1, status);

	        ResultSet rs = cs.executeQuery();

	        while(rs.next()) {
	            Appointment appointment = new Appointment();

	            appointment.setAppointmentId(rs.getInt("appointment_id"));
	            appointment.setDoctorId(rs.getInt("doctor_id"));
	            appointment.setPatientId(rs.getInt("patient_id"));
	            appointment.setAppointmentTime(rs.getTimestamp("appointment_time"));
	            appointment.setStatus(rs.getString("status"));
	            appointment.setDiagnosis(rs.getString("diagnosis"));

	            appointmentList.add(appointment);
	        }
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }
	    return appointmentList;
	}
	
	
	// Update appointment status using stored procedure
	public void updateAppointmentStatusProcedure(int appointmentId, String status) {
	    String sql = "{CALL update_appointment_status(?, ?)}";

	    try(Connection conn = DBConnection.getConnection();
	        CallableStatement cs = conn.prepareCall(sql)) {

	        cs.setInt(1, appointmentId);
	        cs.setString(2, status);

	        cs.execute();
	        System.out.println("-- Appointment status updated successfully --");
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }
	}
	
}