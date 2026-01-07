package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double testCharges;

    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee, double testCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.testCharges = testCharges;
    }

    @Override
    public double calculateBill() {
        double total = consultationFee + testCharges;
        System.out.println("Out-Patient Bill: " + total);
        return total;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
        System.out.println("Record added for Out-Patient.");
    }

    @Override
    public void viewRecords() {
        System.out.println("\nOut-Patient Medical Records:");
        for(String r : records) {
            System.out.println("- " + r);
        }
    }
}