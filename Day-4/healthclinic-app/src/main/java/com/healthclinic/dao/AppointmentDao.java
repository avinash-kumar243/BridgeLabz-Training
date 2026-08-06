package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import java.sql.Types;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Appointment;

// CRUD Operations
public class AppointmentDao {

    // Insert an appointment
    public void insertAppointment(Appointment appointment) {
        String sql = "INSERT INTO appointment (doctor_id, patient_id, appointment_time, status, diagnosis) VALUES (?, ?, ?, ?, ?)";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, appointment.getDoctorId());
            ps.setInt(2, appointment.getPatientId());
            ps.setTimestamp(3, appointment.getAppointmentTime());
            ps.setString(4, appointment.getStatus());
            ps.setString(5, appointment.getDiagnosis());

            ps.executeUpdate(); 

            System.out.println("-- Appointment added successfully --");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update an appointment
    public void updateAppointment(int appointmentId, Appointment appointment) {
        String sql = "UPDATE appointment SET doctor_id=?, patient_id=?, appointment_time=?, status=?, diagnosis=? WHERE appointment_id=?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, appointment.getDoctorId());
            ps.setInt(2, appointment.getPatientId());
            ps.setTimestamp(3, appointment.getAppointmentTime());
            ps.setString(4, appointment.getStatus());
            ps.setString(5, appointment.getDiagnosis());
            ps.setInt(6, appointmentId);

            ps.executeUpdate();

            System.out.println("-- Appointment updated successfully --");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete an appointment
    public void deleteAppointment(int appointmentId) {
        String sql = "DELETE FROM appointment WHERE appointment_id=?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);
            ps.executeUpdate();

            System.out.println("-- Appointment deleted successfully --");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get appointment by ID
    public Appointment getAppointmentById(int appointmentId) {
        String sql = "SELECT * FROM appointment WHERE appointment_id=?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Appointment appointment = new Appointment();

                appointment.setAppointmentId(rs.getInt("appointment_id"));
                appointment.setDoctorId(rs.getInt("doctor_id"));
                appointment.setPatientId(rs.getInt("patient_id"));
                appointment.setAppointmentTime(rs.getTimestamp("appointment_time"));
                appointment.setStatus(rs.getString("status"));
                appointment.setDiagnosis(rs.getString("diagnosis"));

                return appointment;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Get all appointments
    public List<Appointment> getAllAppointments() {
        String sql = "SELECT * FROM appointment";

        List<Appointment> appointmentList = new ArrayList<>();

        try(Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql)) {

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
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointmentList;
    }
}