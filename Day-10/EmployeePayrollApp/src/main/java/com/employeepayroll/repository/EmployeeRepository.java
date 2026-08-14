package com.employeepayroll.repository;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.employeepayroll.dto.EmployeeRequestDto;
import com.employeepayroll.model.Employee;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;
 
//I am using Spring JDBC, So I will explicitly handle the database interaction using SQL and JdbcTemplate
@Repository
public class EmployeeRepository {

    private final JdbcTemplate jdbcTemplate;

    // Constructor Injection
    public EmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    
    // Create
    public Employee save(Employee employee) {

        String sql = """
	                INSERT INTO employees
	                (name, email, phone, salary, dept_id)
	                VALUES (?, ?, ?, ?, ?)
                """;

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {

            PreparedStatement ps = connection.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS
            );

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getPhone());
            ps.setBigDecimal(4, employee.getSalary());
            ps.setLong(5, employee.getDeptId());

            return ps;

        }, keyHolder);

        employee.setId(keyHolder.getKey().longValue());

        return employee;
    }
    

    // Get all
    public List<Employee> findAll() {

        String sql = """
	                SELECT id, name, email, phone, salary, dept_id
	                FROM employees
                """;

        return jdbcTemplate.query(sql, (rs, rowNum) -> {

            Employee employee = new Employee();

            employee.setId(rs.getLong("id"));
            employee.setName(rs.getString("name"));
            employee.setEmail(rs.getString("email"));
            employee.setPhone(rs.getString("phone"));
            employee.setSalary(rs.getBigDecimal("salary"));
            employee.setDeptId(rs.getLong("dept_id"));

            return employee;
        });
    }

    
    // Get by Id
    public Optional<Employee> findById(Long id) {

        String sql = """
	                SELECT id, name, email, phone, salary, dept_id
	                FROM employees
	                WHERE id = ?
                """;

        List<Employee> employees = jdbcTemplate.query(
                sql,
                (rs, rowNum) -> {

                    Employee employee = new Employee();

                    employee.setId(rs.getLong("id"));
                    employee.setName(rs.getString("name"));
                    employee.setEmail(rs.getString("email"));
                    employee.setPhone(rs.getString("phone"));
                    employee.setSalary(rs.getBigDecimal("salary"));
                    employee.setDeptId(rs.getLong("dept_id"));

                    return employee;
                },
                id
        );

        return employees.stream().findFirst();
    }
    

    // Update
    public boolean update(Long id, Employee employee) {

        String sql = """
	                UPDATE employees
	                SET name = ?,
	                    email = ?,
	                    phone = ?,
	                    salary = ?,
	                    dept_id = ?
	                WHERE id = ?
                """;

        int change = jdbcTemplate.update(
                sql,
                employee.getName(),
                employee.getEmail(),
                employee.getPhone(),
                employee.getSalary(),
                employee.getDeptId(),
                id
        );

        return change > 0;
    }
    
    
    // Patch
    public int update(Long id, EmployeeRequestDto requestDto) {

        String sql = """
	                UPDATE employees
	                SET name = ?,
	                    email = ?,
	                    phone = ?,
	                    salary = ?,
	                    dept_id = ?
	                WHERE id = ?
                """;

        return jdbcTemplate.update(
	                sql,
	                requestDto.getName(),
	                requestDto.getEmail(),
	                requestDto.getPhone(),
	                requestDto.getSalary(),
	                requestDto.getDeptId(),
	                id
        );
    }

    
    // Delete
    public boolean deleteById(Long id) {

        String sql = """
	                DELETE FROM employees
	                WHERE id = ?
                """;

        int change = jdbcTemplate.update(sql, id);

        return change > 0;
    }
    
}