package org.example.SerializationProject.model;
import static org.example.SerializationProject.model.BinaryTree.root;
import static org.example.SerializationProject.model.BinaryTree.tempNode;

// Traverses the binary tree
public class Recursive {
    public static Employee recursiveCall(int value) {
        if (value < tempNode.getValue().getEmployeeID()) {
            if (tempNode.getLeftChild().getValue().getEmployeeID() == value) {
                return tempNode.getLeftChild().getValue();
            }
            tempNode = tempNode.getLeftChild();
            return recursiveCall(value);
        } else if (value > tempNode.getValue().getEmployeeID()) {
            if (tempNode.getRightChild().getValue().getEmployeeID() == value) {
                return tempNode.getRightChild().getValue();
            }
            tempNode = tempNode.getRightChild();
            return recursiveCall(value);
        }
        return null;
    }
}
