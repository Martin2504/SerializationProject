package org.example.SerializationProject.model;

// This class calls the Employee Constructor to create
// employee objects.
// This class would be called n amount of times with different params each time
public class EmployeeCreator {

    public static Employee createEmployee(String[] employee) {

        Employee newEmployee = new Employee(
                Integer.parseInt(employee[0]),  // employeeID
                employee[1],                    // title
                employee[2],                    // firstName
                employee[3],                    // middleInitial
                employee[4],                    // lastName
                employee[5],                    // gender
                employee[6],                    // eMail
                employee[7],                    // DOB
                employee[8],                    // DOJ
                employee[9]);                   // Salary

        return newEmployee;
    }
}
