package org.example.SerializationProject.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.example.SerializationProject.controller.Creator.employeeMap;
import static org.example.SerializationProject.controller.Creator.lastname;

// This class takes the last name, searches the map, and returns the ID(s).
public class EmployeeIDFinder {
    public static List findEmployeeIDGivenLastName(String lastName) {

        // returns a list
        List listOfIds = new ArrayList();
        for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {

            if(entry.getValue().toLowerCase().equals(lastname.toLowerCase())) {
                listOfIds.add(entry.getKey());
            }
        }

        return listOfIds;
    }

}
