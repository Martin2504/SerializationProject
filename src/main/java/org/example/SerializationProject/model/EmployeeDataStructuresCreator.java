package org.example.SerializationProject.model;

// This class will take an Employee object and add it to a list and a map.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDataStructuresCreator {
    static List<Employee> employeeList = new ArrayList<>();

    static Map<Integer,String> employeeMap  = new HashMap<>();

    // Create list and a map here.
    public static void createList(Employee employee) {
        // Add to list here
        // Add last_name and ID to a map
        EmployeeDataStructuresCreator.employeeList.add(employee);
        EmployeeDataStructuresCreator.employeeMap.put(employee.getEmployeeID(),employee.getLastName());


        }

        }



