package org.example.SerializationProject.model;

// This class will take an Employee object and add it to a list and a map.

import org.example.SerializationProject.controller.Creator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDataStructuresCreator {


    // Create list and a map here.
    public static void createList(Employee employee) {
        // Add to list here
        // Add last_name and ID to a map
        Creator.employeeList.add(employee);
        Creator.employeeMap.put(employee.getEmployeeID(),employee.getLastName());


        }

        }



