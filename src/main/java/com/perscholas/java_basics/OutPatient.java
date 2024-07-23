package com.perscholas.java_basics;

public class OutPatient extends Patient {
    public String appointmentDate;
    public String doctorName;

    public OutPatient(int patientId, String name, String appointmentDate, String doctorName) {
        super(patientId, name);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override public String toString(){
        return "";
    }
}
