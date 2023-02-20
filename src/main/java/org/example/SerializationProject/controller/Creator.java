package org.example.SerializationProject.controller;

import org.example.SerializationProject.model.*;
import org.example.SerializationProject.model.Logger.ConsoleClass;
import org.example.SerializationProject.model.Logger.FileHandlerClass;
import org.example.SerializationProject.model.Logger.LoggerClass;
import org.example.SerializationProject.view.EmployeeReturner;

import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

// This class' sole responsibility will be to call other classes.
// Hence, 'creating' the project.
// This will glue all the classes together. It's to be done last.
public class Creator {

    public static String lastname;
    public static List<Employee> employeeList = new ArrayList<>();

    public static Map<Integer,String> employeeMap  = new HashMap<>();

    public static void create() {
        FileHandlerClass.getFileHandler();
        ConsoleClass.runConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employees do you want to see:");
        int input = scanner.nextInt();
        try {
            for(int i =0; i< input; i++) {
                String[] employeeList2 = StringSplitter.splitString(ArraySplitter.splitArray(EmployeeFactory.getEmployees(input), i));
                EmployeeDataStructuresCreator.createList(EmployeeCreator.createEmployee(employeeList2));
                //LoggerClass.createLog("ALL", );
            }
        }
        catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
        BinaryTree binaryTree = new BinaryTree();
        NodeInputter.inputNodes(employeeList, binaryTree);

        System.out.print("give last name:");
        lastname = scanner.next();

        List listOfIds = new ArrayList();
        listOfIds.addAll(EmployeeIDFinder.findEmployeeIDGivenLastName(lastname));
        List finalListEmployee = new ArrayList();
        for(int i = 0; i<listOfIds.size(); i++){
            finalListEmployee.add(BinaryTree.findEmployeeByID((Integer) listOfIds.get(i)));
        }
        EmployeeReturner.returnEmployee(finalListEmployee);
    }
}
