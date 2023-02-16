package org.example.SerializationProject.model;
import static org.example.SerializationProject.model.BinaryTree.root;
import static org.example.SerializationProject.model.BinaryTree.tempNode;

// Traverses the binary tree
public class Recursive {
    public static boolean recursiveCall(int value) {
        // Check if root = null   -> throw ChildNotFoundException
        // else continue

        if (value < tempNode.getValue().getEmployeeID()) {
            // check if tempNode has left child
            if (tempNode.getLeftChild().getValue().getEmployeeID() == value) {
                return true;
            }
            tempNode = tempNode.getLeftChild();
            return recursiveCall(value);
        } else if (value > tempNode.getValue().getEmployeeID()) {
            if (tempNode.getRightChild().getValue().getEmployeeID() == value) {
                return true;
            }
            tempNode = tempNode.getRightChild();
            return recursiveCall(value);
        }
        return false;
    }
}
