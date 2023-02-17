package org.example.SerializationProject.view;

import org.example.SerializationProject.model.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeReturnerTest {

    EmployeeReturnerTest(){

    }

    @Test
    @DisplayName("Test getEmployeeID")
    public void testGetEmployeeID(){
        Employee test1 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                               "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        int expected = 102;
        int result = test1.getEmployeeID();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getTitle")
    public void testGetTitle(){
        Employee test2 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        String expected = "Mr";
        String result = test2.getTitle();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getFirstName")
    public void testGetFirstName(){
        Employee test3 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        String expected = "Bob";
        String result = test3.getFirstName();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getMiddleInitial")
    public void testGetMiddleInitial(){
        Employee test4 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        String expected = "R";
        String result = test4.getMiddleInitial();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getLastName")
    public void testGetLastName(){
        Employee test5 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        String expected = "Vance";
        String result = test5.getLastName();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getGender")
    public void testGetGender(){
        Employee test6 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        String expected = "M";
        String result = test6.getGender();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getEmail")
    public void testGetEmail(){
        Employee test7 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        String expected = "bobvance@email.com";
        String result = test7.geteMail();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getDOB")
    public void testGetDOB(){
        Employee test8 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        String expected = "19/12/1967";
        String result = test8.getDOB();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getDOJ")
    public void testGetDOJ(){
        Employee test9 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        String expected = "13/10/2020";
        String result = test9.getDOJ();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getSalary")
    public void testGetSalary(){
        Employee test10 = new Employee(102, "Mr", "Bob", "R", "Vance", "M",
                "bobvance@email.com", "19/12/1967", "13/10/2020", "10000");
        String expected = "10000";
        String result = test10.getSalary();
        assertEquals(expected, result);
    }








}