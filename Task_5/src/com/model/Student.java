package Task_5.src.com.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String rollNumber;
    private String grade;
    private int contactNumber;
    private String email;


    public Student(String name, String rollNumber, String grade,int contactNumber, String email ) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return name +  " (" + rollNumber + ") - Grade: " + grade;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
