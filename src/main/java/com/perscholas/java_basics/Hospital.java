package com.perscholas.java_basics;

import java.util.*;

public class Hospital<T extends Patient> {

    List<T> patients;
    public Hospital(){
        this.patients=new ArrayList<>();
    }
    public Hospital(List<T> patients) {
        this.patients = patients;
    }

    public Patient getPatients(int patientID) {
        for(Patient patient:patients)
        {
            if(patient.getPatientID()==patientID)
                return patient;

        }
        return null;
    }

    public void addPatient(T patient) {
        patients.add(patient);
    }
}



