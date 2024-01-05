package MultipleClasses;

import java.util.*;

public class Student {
    int studentID;
    String name;
    String email;
    Long contactNo;

    // properties
    Student(int studentID, String name, String email, Long contactNo) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
    }
    // getters and setters for the values

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNumber(Long contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, name, email, contactNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return studentID == student.studentID &&
                Objects.equals(name, student.name) &&
                Objects.equals(email, student.email) &&
                Objects.equals(contactNo, student.contactNo);
    }
}
