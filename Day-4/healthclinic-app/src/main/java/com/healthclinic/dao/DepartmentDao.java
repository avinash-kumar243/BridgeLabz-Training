package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Department;

// CRUD Operations
public class DepartmentDao {

    // Insert a specialization
    public void insertDepartment(Department department) {
        String sql = "INSERT INTO department (department_name) VALUES (?)";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, department.getDepartmentName());
            ps.executeUpdate();

            System.out.println("-- Department added successfully --");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    // Update a specialization
    public void updateDepartment(int departmentId, Department department) {
        String sql = "UPDATE department SET department_name=? WHERE department_id=?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, department.getDepartmentName());
            ps.setInt(2, departmentId);

            ps.executeUpdate();

            System.out.println("-- Department updated successfully --");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete a department
    public void deleteDepartment(int department_id) {
        String sql = "DELETE FROM department WHERE department_id=?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, department_id);
            ps.executeUpdate();

            System.out.println("-- Department deleted successfully --");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    // Get department by ID
    public Department getDepartmentById(int department_id) {
        String sql = "SELECT * FROM department WHERE department_id=?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, department_id);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                Department department = new Department();

                department.setDepartmentId(rs.getInt("department_id"));
                department.setDepartmentName(rs.getString("department_name"));

                return department;
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Get all departments
    public List<Department> getAllDepartments() {
        String sql = "SELECT * FROM department";

        List<Department> departmentList = new ArrayList<>();

        try(Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement(); 
            ResultSet rs = st.executeQuery(sql)) {

            while(rs.next()) {
                Department department = new Department();

                department.setDepartmentId(rs.getInt("department_id"));
                department.setDepartmentName(rs.getString("department_name"));

                departmentList.add(department);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        } 
        return departmentList;
    }
}