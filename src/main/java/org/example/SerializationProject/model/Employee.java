package org.example.SerializationProject.model;

// This class represents an employee.

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID && Objects.equals(title, employee.title) && Objects.equals(firstName, employee.firstName) && Objects.equals(middleInitial, employee.middleInitial) && Objects.equals(lastName, employee.lastName) && Objects.equals(gender, employee.gender) && Objects.equals(eMail, employee.eMail) && Objects.equals(DOB, employee.DOB) && Objects.equals(DOJ, employee.DOJ) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, title, firstName, middleInitial, lastName, gender, eMail, DOB, DOJ, salary);
    }
}
