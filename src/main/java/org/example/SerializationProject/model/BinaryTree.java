package org.example.SerializationProject.model;

// The binary tree which will hold the Employees
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
    public boolean findEmployeeByID(int id) {
        if (root == null ) {
            return false;
        } else if (root.getValue().getEmployeeID() == id) {
            return true;
        }
        // If returns true ... Then call similar method to return an Employee
        tempNode = root;
        boolean answer = Recursive.recursiveCall(id);
        tempNode = root;

        // Similar method call goes here.
        // Should return an employee.

        return answer;

    }
}
