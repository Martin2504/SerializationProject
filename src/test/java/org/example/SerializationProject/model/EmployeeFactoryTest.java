package org.example.SerializationProject.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class EmployeeFactoryTest {

    public static String[] firstArray;
    public static String[] secondArray;
    public static String[] thirdArray;
    public static void pArray(String[] s){
    System.out.println(s.toString());
    }


    static {
        try {
            firstArray = mockStringMaker(100);
            secondArray = mockStringMaker(500);
            thirdArray = mockStringMaker(1000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//
//    @Test
//    void getEmployees1() throws IOException {
//        String[] result = EmployeeFactory.getEmployees(100);
//        String[] expected = firstArray;
//        Assertions.assertArrayEquals(expected, result);
//
//    }
//
//    @Test
//    void getEmployees2() throws IOException {
//        String[] result = EmployeeFactory.getEmployees(500);
//        String[] expected = secondArray;
//        Assertions.assertArrayEquals(expected, result);
//
//    }
//
//    @Test
//    void getEmployees3() throws IOException {
//        String[] result = EmployeeFactory.getEmployees(1000);
//        String[] expected = thirdArray;
//        Assertions.assertArrayEquals(expected, result);
//
//    }

    @Test
    void checkNull() throws IOException{
        String[] result = EmployeeFactory.getEmployees(1000);
        Assertions.assertNotNull(result);

    }

    @Test
    void checkLength() throws IOException{
        int result = EmployeeFactory.getEmployees(1000).length;
        int expected = 1000;
        Assertions.assertEquals(expected, result);

    }

    public static String[] mockStringMaker(int j) throws IOException {

        String employeeLine;
        List<String> result = new ArrayList<>();

        BufferedReader f = new BufferedReader(new FileReader("src/main/resources/employees.csv"));
        // read all the records from the file and add them to the list
        for(int i = 0; i < j ; i++){

            employeeLine = f.readLine();
            result.add(employeeLine);
        }


        // return the first numEmployees values as an array
        return result.subList(0,j).toArray(new String[0]);
    }
}