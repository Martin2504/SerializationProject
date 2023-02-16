package org.example.SerializationProject.model;
import java.util.List;

// Takes the list of Employee objects and adds them to the binary tree.
public class NodeInputter {
    public static void inputNodes(List<Employee> list, BinaryTree tree)  {
        //Created an instance of BinaryTree in the parameter and there is also a list of all employees which is listed in the parameters
        for (Employee employee : list) {
            tree.addElement(employee);
            // for each employee object in the list we call the "addElement" method of the BinaryTree instance to add the employee to the tree
        }
    }
}
