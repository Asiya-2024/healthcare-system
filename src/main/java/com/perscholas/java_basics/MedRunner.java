package com.perscholas.java_basics;

import main.java.com.perscholas.java_basics.MedicalRecord;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MedRunner {
    public static void main(String[] args) {
        Patient patient = new Patient(1,"Patricia");
        MedicalRecord medRecord1 = new MedicalRecord("08/05/2024", "Checkup 1");
        MedicalRecord medRecord2 = new MedicalRecord("09/06/2024", "Checkup 2");
        MedicalRecord medRecord3 = new MedicalRecord("10/10/2024", "Checkup 3");
        MedicalRecord medRecord4 = new MedicalRecord("11/11/2024", "Checkup 4");
        ArrayList<MedicalRecord> medRecords = new ArrayList<MedicalRecord>(Arrays.asList(medRecord1,medRecord2));


        System.out.println(patient.getPatientID());
        System.out.println(patient.getName());
        patient.setPatientID(10);
        patient.setName("Thomas");
        System.out.println(patient.getName());
        System.out.println(patient.getPatientID());

        patient.setMedicalHistory(medRecords);
        patient.addMedicalRecord(medRecord3);
        System.out.println(patient.getMedicalHistory());
        patient.updateMedicalRecord(0, medRecord4);
        System.out.println(patient.getMedicalHistory());
    }
}