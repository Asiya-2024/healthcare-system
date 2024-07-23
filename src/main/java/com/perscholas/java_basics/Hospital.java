package com.perscholas.java_basics;

import java.util.*;

public class Hospital<T extends Patient> {

    List<T> patients;

    public Hospital(List<T> patients) {
        this.patients = patients;
    }

    public List<T> getPatients() {
        return patients;
    }

    public void setPatients(List<T> patients) {
        this.patients = patients;
    }
}



