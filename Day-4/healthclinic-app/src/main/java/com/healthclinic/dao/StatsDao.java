package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Stats;

public class StatsDao {
	
	// Get one doctor stats by doctor id
    public Stats getStatsByDoctorId(int doctorId) {

        String sql = "SELECT doctor_id, COUNT(*) AS patient_count FROM appointment WHERE doctor_id=? GROUP BY doctor_id";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, doctorId);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                Stats stats = new Stats(rs.getInt("doctor_id"), rs.getInt("patient_count"));
                return stats; 
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Get All Doctor stats
    public List<Stats> getAllDoctorStats() {
        String sql = "SELECT doctor_id, COUNT(*) AS patient_count FROM appointment GROUP BY doctor_id";

        List<Stats> statsList = new ArrayList<>();

        try(Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql)) {

            while(rs.next()) {
                Stats stats = new Stats(rs.getInt("doctor_id"), rs.getInt("patient_count"));
                statsList.add(stats);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return statsList;
    }
    
}