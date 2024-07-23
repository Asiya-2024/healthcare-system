package com.perscholas.java_basics;

import java.util.ArrayList;
import main.java.com.perscholas.java_basics.MedicalRecord;

public class Patient {
    public int patientID;
    public String name;
    public ArrayList<MedicalRecord> medicalHistory = new ArrayList<MedicalRecord>();

    public Patient(int patientId, String name) {
        this.patientID = patientId;
        this.name = name;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
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