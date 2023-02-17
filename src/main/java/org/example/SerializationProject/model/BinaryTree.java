package org.example.SerializationProject.model;

import java.util.HashMap;
import java.util.Map;

// The binary tree which will hold the Employees.
// This class handles Binary Tree operations.
public class BinaryTree implements IBinaryTree{

    static Node root;
    static Node tempNode = root;        // Basically serves as a pointer

    @Override
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

    @Override
    public Employee findEmployeeByID(int id) {
        Employee employeeFoundByID = null;
        if (root == null) {
            System.out.println("Binary Tree not populated");
        } else if (root.getValue().getEmployeeID() == id) {
            employeeFoundByID =  root.getValue();
        }

        tempNode = root;
        Map map = new HashMap();    // makeshift Map

        if (!map.containsValue(3)) {        // Check if it's contained.
            System.out.println("Name entered does not belong to the pool");
        } else {
            employeeFoundByID = Recursive.recursiveCall(id);
        }

        tempNode = root;

        return employeeFoundByID;

    }
}
