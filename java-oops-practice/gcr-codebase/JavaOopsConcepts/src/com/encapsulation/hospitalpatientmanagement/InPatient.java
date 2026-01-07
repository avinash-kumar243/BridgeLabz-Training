package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;
    private double treatmentCost;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, int daysAdmitted, double roomChargePerDay, double treatmentCost) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
        this.treatmentCost = treatmentCost;
    }

    @Override
    public double calculateBill() {
        double total = (daysAdmitted * roomChargePerDay) + treatmentCost;
        System.out.println("In-Patient Bill: " + total);
        return total;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
        System.out.println("Record added for In-Patient.");
    }

    @Override
    public void viewRecords() {
        System.out.println("\nIn-Patient Medical Records:");
        for(String r : records) {
            System.out.println("- " + r);
        }
    }
}