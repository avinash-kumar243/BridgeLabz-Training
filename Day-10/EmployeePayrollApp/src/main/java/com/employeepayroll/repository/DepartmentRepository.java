package com.employeepayroll.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.employeepayroll.dto.DepartmentRequestDto;
import com.employeepayroll.model.Department;

import java.sql.PreparedStatement;
import java.sql.Statement;

//I am using Spring JDBC, So I will explicitly handle the database interaction using SQL and JdbcTemplate
@Repository
public class DepartmentRepository {
	
	private final JdbcTemplate jdbcTemplate;

	// Construction Injection
	public DepartmentRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	// Create
	public Department save(Department department) { 
		
		String sql = """
					INSERT INTO departments (name, description)
					VALUES (?, ?)
				""";
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(connection -> {
			PreparedStatement ps = connection.prepareStatement(
					sql, 
					Statement.RETURN_GENERATED_KEYS
			); 
			
			ps.setString(1, department.getName());
	        ps.setString(2, department.getDescription());

	        return ps;
		}, keyHolder);
		
		department.setId(keyHolder.getKey().longValue());
		
		return department;   
	}
	
	
	// Update
	public boolean update(Long id, Department department) {
		
		String sql = """
	                UPDATE departments
	                SET name = ?, description = ?
	                WHERE id = ? 
                """; 

        int change = jdbcTemplate.update(
                sql,
                department.getName(),
                department.getDescription(),
                id
        );

        return change > 0;
	}
	
	
	// Delete
	public boolean deleteById(Long id) {
		
		String sql = """
	                DELETE FROM departments
	                WHERE id = ?
                """;

        int change = jdbcTemplate.update(sql, id); 

        return change > 0;
	}
	
	
	// Patch
	public int update(
	        Long id,
	        DepartmentRequestDto requestDto) {

	    String sql = """
		            UPDATE departments
		            SET name = ?,
		                description = ?
		            WHERE id = ?
	            """;

	    return jdbcTemplate.update(
			            sql,
			            requestDto.getName(),
			            requestDto.getDescription(),
			            id
	    );
	}
	
	
	// Get by Id
	public Optional<Department> findById(Long id) {
		
		String sql = """
	                SELECT id, name, description
	                FROM departments
	                WHERE id = ?
                """;

        List<Department> departments = jdbcTemplate.query(sql, (rs, rowNum) -> {
        	
                    Department department = new Department();

                    department.setId(rs.getLong("id"));
                    department.setName(rs.getString("name"));
                    department.setDescription(rs.getString("description"));

                    return department;
                }, id
        	);

        return departments.stream().findFirst(); 
	}
	
	 
	// Get all
	public List<Department> findAll() {
		
		String sql = """
					SELECT id, name, description
					FROM departments 
                """;
 
        		return jdbcTemplate.query(sql, (rs, rowNum) -> {

            Department department = new Department();

            department.setId(rs.getLong("id"));
            department.setName(rs.getString("name"));
            department.setDescription(rs.getString("description"));

            return department;
        });
	}
	
}