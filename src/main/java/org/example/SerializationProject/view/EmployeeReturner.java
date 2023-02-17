package org.example.SerializationProject.view;

import org.example.SerializationProject.model.Employee;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmployeeReturner {
    public static void returnEmployee(List<Employee> employee) {
        try {
            FileWriter myWriter = new FileWriter("src/main/resources/EmployeeDetails.txt");
            for(Employee e : employee){
                myWriter.write("Employee ID: " + e.getEmployeeID() + "\n" +
                                     "Employee Name: " + e.getTitle() + " " + e.getFirstName() + " " + e.getMiddleInitial() + " " + e.getLastName() + "\n +" +
                                     "Employee Gender: " + e.getGender() + "\n" +
                                     "Employee E-mail: " + e.geteMail() + "\n" +
                                     "Employee DOB: " + e.getDOB() + "\n" +
                                     "Employee DOJ: " + e.getDOJ() + "\n" +
                                     "Employee Salary: " + e.getSalary());
            }
            myWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
