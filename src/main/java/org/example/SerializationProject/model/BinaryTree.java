package org.example.SerializationProject.model;

import org.example.SerializationProject.controller.Creator;

import java.util.HashMap;
import java.util.Map;

// The binary tree which will hold the Employees.
// This class handles Binary Tree operations.
public class BinaryTree{

    static Node root;
    static Node tempNode = root;        // Basically serves as a pointer


    public void addElement(Employee element) {
        if (root == null) {
            root = new Node(element);
            tempNode = root;
        }
        if (element.getEmployeeID() < tempNode.getValue().getEmployeeID()) {
            if (tempNode.isLeftChildEmpty()) {
                tempNode.setLeftChild(new Node(element));
            } else {
                tempNode = tempNode.getLeftChild();
                addElement(element);
            }
        } else if (element.getEmployeeID() > tempNode.getValue().getEmployeeID()) {
            if (tempNode.isRightChildEmpty()) {
                tempNode.setRightChild(new Node(element));
            } else {
                tempNode = tempNode.getRightChild();
                addElement(element);
            }
        }
        tempNode = root;
    }


    public static Employee findEmployeeByID(int id) {
        Employee employeeFoundByID = null;
        if (root == null) {
            System.out.println("Binary Tree not populated");
        } else if (root.getValue().getEmployeeID() == id) {
            employeeFoundByID =  root.getValue();
        }

        tempNode = root;
        if (!Creator.employeeMap.containsKey(id)) {        // Check if it's contained.
            System.out.println("Name entered does not belong to the pool");
        } else {
            employeeFoundByID = Recursive.recursiveCall(id);
        }
        tempNode = root;

        return employeeFoundByID;
    }
}
