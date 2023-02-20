package org.example.SerializationProject.view;

import org.example.SerializationProject.model.Employee;
import org.example.SerializationProject.model.EmployeeFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmployeeReturner {
    public static void returnEmployee(List<Employee> employee) {
        try {
            FileWriter myWriter = new FileWriter("src/main/resources/EmployeeDetails.log");
            if(employee.size()!=0) {
                for (Employee e : employee) {
                    myWriter.append("Employee ID: " + e.getEmployeeID() + "\n" +
                            "Employee Name: " + e.getTitle() + " " + e.getFirstName() + " " + e.getMiddleInitial() + " " + e.getLastName() + "\n" +
                            "Employee Gender: " + e.getGender() + "\n" +
                            "Employee E-mail: " + e.geteMail() + "\n" +
                            "Employee DOB: " + e.getDOB() + "\n" +
                            "Employee DOJ: " + e.getDOJ() + "\n" +
                            "Employee Salary: " + e.getSalary() + "\n" +
                            "----------------------------------------\n");
                }
                myWriter.close();
                System.out.println("Last name found! Check the \"EmployeeDetails.log\" file in the resources folder for further information");
            }else{
                myWriter.write("Employee not found");
                myWriter.close();
                System.out.println("No employee found with that last name");
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
