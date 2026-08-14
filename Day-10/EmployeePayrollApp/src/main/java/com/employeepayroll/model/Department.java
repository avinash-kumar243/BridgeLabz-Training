package com.employeepayroll.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Since I am using Spring JDBC, not JPA, so our Employee and Department classes are plain Java classes. Do not use @Entity, @Table, @ManyToOne
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	
    private Long id;
    private String name;
    private String description;
}