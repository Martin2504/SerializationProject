package org.example.SerializationProject.model;

import java.util.ArrayList;

// This class takes the output of ArraySplitter and
// creates a new array for each attribute seperated by a comma.
public class StringSplitter {


    public static String[] splitString(String employeeDetails) {
        if (employeeDetails==null){
            return new String[]{""};
        }
        String[] splitAtComma = employeeDetails.split(",");
        return  splitAtComma;
    }
}
