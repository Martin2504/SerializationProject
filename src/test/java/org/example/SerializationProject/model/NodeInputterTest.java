package org.example.SerializationProject.model;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class NodeInputterTest {

    @Test
    @DisplayName("Check if the employee objects are added to the binary tree")
    public void testInputNodes() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Mr.", "John", "D", "Doe", "M", "john.doe@example.com", "01-01-1980", "01-01-2000", "10000"));
        employees.add(new Employee(2, "Ms.", "Jane", "D", "Doe", "F", "jane.doe@example.com", "02-02-1990", "01-01-2010", "20000"));
        employees.add(new Employee(3, "Mr.", "Bob", "N", "Smith", "M", "bob.smith@example.com", "03-03-2000", "01-01-2020", "30000"));

        BinaryTree tree = new BinaryTree();
        NodeInputter.inputNodes(employees, tree);
        assertTrue(tree.findEmployeeByID(1));
        assertTrue(tree.findEmployeeByID(2));
        assertTrue(tree.findEmployeeByID(3));
        assertFalse(tree.findEmployeeByID(4));
    }

    @Test
    @DisplayName("Check if the input nodes method works for an empty list")
    public void testInputNodesEmptyList() {
        List<Employee> employees = new ArrayList<>();
        BinaryTree tree = new BinaryTree();
        NodeInputter.inputNodes(employees, tree);
        assertFalse(tree.findEmployeeByID(1));
    }

    @Test
    @DisplayName("Check if the input nodes method works for a list with one employee")
    public void testInputNodesSingleEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Mr.", "John", "D", "Doe", "M", "john.doe@example.com", "01-01-1980", "01-01-2000", "10000"));
        BinaryTree tree = new BinaryTree();
        NodeInputter.inputNodes(employees, tree);
        assertTrue(tree.findEmployeeByID(1));
    }

    @Test
    @DisplayName("Check if the input nodes method works for a list with multiple employees with the same ID")
    public void testInputNodesDuplicateIDs() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Mr.", "John", "D", "Doe", "M", "john.doe@example.com", "01-01-1980", "01-01-2000", "10000"));
        employees.add(new Employee(1, "Mr.", "John", "D", "Doe", "M", "john.doe@example.com", "01-01-1980", "01-01-2000", "10000"));
        BinaryTree tree = new BinaryTree();
        NodeInputter.inputNodes(employees, tree);
        assertTrue(tree.findEmployeeByID(1));
    }

    @Test
    public void testInputNodesWithNull() {
        BinaryTree tree = new BinaryTree();
        List<Employee> list = null;
        assertThrows(NullPointerException.class, () -> {
            NodeInputter.inputNodes(list, tree);
        });
    }

}