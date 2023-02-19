package org.example.SerializationProject.model;

// This class takes the output of the Employee Factory and splits it
// into Strings, separating each employee.

public class ArraySplitter {
    public static String splitArray(String[] EFOutput,int index) {
        if(EFOutput!=null) {
                return EFOutput[index];
        }
        return "";
    }
}
