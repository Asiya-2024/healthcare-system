package com.perscholas.java_basics;

public class InPatient<T extends Patient> extends Patient{
    String admissionDate;
    String roomNumber;

    public InPatient(int patientID,String name,String roomNumber, String admissionDate) {
        super(patientID,name);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "InPatient{" +
                "admissionDate='" + admissionDate + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
