package com.perscholas.java_basics;

import java.util.*;

public class Hospital<T extends Patient> {

    List<T> patients;

    public Hospital(List<T> patients) {
        this.patients = patients;
    }

    public Patient getPatients(int patientID) {
        for(Patient patient:patients)
        {
            if(patient.getPatientId()==patientID)
                return patient;

        }
        return null;
    }

    public void addPatient(T patient) {
        patients=new ArrayList<>();
        patients.add(patient);
    }
}



