package com.encapsulation.hospitalpatientmanagement;

public class HospitalMain {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P101", "Arjun", 32, 5, 2000, 8000);

        Patient p2 = new OutPatient("P202", "Neha", 27, 1200, 1800);

        p1.getPatientDetails();
        p1.calculateBill();

        p2.getPatientDetails();
        p2.calculateBill();

        MedicalRecord m1 = (MedicalRecord) p1;
        m1.addRecord("Admitted due to fever.");
        m1.viewRecords();

        MedicalRecord m2 = (MedicalRecord) p2;
        m2.addRecord("Routine check-up completed.");
        m2.viewRecords();
    }
}