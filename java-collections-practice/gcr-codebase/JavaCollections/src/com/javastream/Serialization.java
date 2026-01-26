package com.javastream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Employee implements Serializable {
	private static final long serialVersiomUID = 1L;
	
	private int id;
	private String name;
	private String dept;
	private double salary;
	
	public Employee(int id, String name, String dept, int salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary -= salary;
	}
	
	public void display() {
		System.out.println(id + " || " + name + " || " + dept + " || " + salary);
	}
	
}
public class Serialization {
	public static void main(String[] args) {
		String fileName = "employees.dat";

        // Create Employee list
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Avinash", "IT", 50000));
        empList.add(new Employee(102, "Rahul", "HR", 45000));
        empList.add(new Employee(103, "Sneha", "Finance", 60000));

        // Serialization
        try(ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(empList);
            System.out.println("Employees serialized successfully.");

        } catch(IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        
        // Deserialization 
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();

            System.out.println("\nEmployee Details:");
            for(Employee emp : list) {
                emp.display();
            }

        } catch(IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch(ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
	}
}