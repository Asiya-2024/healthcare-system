package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    public int patientId;
    public String name;
    public ArrayList<MedicalRecord> medicalHistory = new ArrayList<MedicalRecord>();

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(ArrayList<MedicalRecord> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void addMedicalRecord(MedicalRecord record) {
        medicalHistory.add(record);
    }

    public void updateMedicalRecord(int index, MedicalRecord newRecord) {
        medicalHistory.set(index, newRecord);
    }

    public MedicalRecord getMedicalRecord(int index) {
        return medicalHistory.get(index);
    }
}