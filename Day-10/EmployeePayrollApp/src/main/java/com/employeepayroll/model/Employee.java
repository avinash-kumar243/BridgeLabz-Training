package com.employeepayroll.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Since you are using Spring JDBC, not JPA, your Employee and Department classes are plain Java classes. Do not use @Entity, @Table, @ManyToOne
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
    private Long id;
    private String name;
    private String email;
    private String phone;
    private BigDecimal salary;
    private Long deptId;
}