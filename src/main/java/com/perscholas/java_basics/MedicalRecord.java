package main.java.com.perscholas.java_basics;

public class MedicalRecord {
    private String date;
    private String description;

    // Constructor to initialize date and description
    public MedicalRecord(String date, String description) {
        this.date = date;
        this.description = description;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "MedicalRecord{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}