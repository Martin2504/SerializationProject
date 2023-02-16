package org.example.SerializationProject.model;

// This class represents an employee.

public class Employee {

    int employeeID;
    String title, firstName, middleInitial, lastName, gender,
            eMail, DOB, DOJ, salary;

    public Employee(int employeeID, String title, String firstName, String middleInitial,
                    String lastName, String gender, String eMail, String DOB,
                    String DOJ, String salary) {
        this.employeeID = employeeID;
        this.title = title;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.gender = gender;
        this.eMail = eMail;
        this.DOB = DOB;
        this.DOJ = DOJ;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String geteMail() {
        return eMail;
    }

    public String getDOB() {
        return DOB;
    }

    public String getDOJ() {
        return DOJ;
    }

    public String getSalary() {
        return salary;
    }
}
