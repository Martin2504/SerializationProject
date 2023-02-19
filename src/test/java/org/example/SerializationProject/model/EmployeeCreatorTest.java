package org.example.SerializationProject.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeCreatorTest {

    // 260736,Ms.,Zelda,P,Forest,F,zelda.forest@ibm.com,11/27/1959,1/28/2014,176642

    @Test
    @DisplayName("Testing the EmployeeCreator class")
    public void testCreateEmployee() {
        Employee expectedEmployee = new Employee(
                Integer.parseInt("260736"), "Ms.", "Zelda", "P", "Forest", "F",
                        "zelda.forest@ibm.com", "11/27/1959", "1/28/2014", "176642");
        Employee testEmployee = EmployeeCreator.createEmployee(new String[]{"260736", "Ms.", "Zelda", "P", "Forest", "F",
                "zelda.forest@ibm.com", "11/27/1959", "1/28/2014", "176642"});
        Assertions.assertTrue(expectedEmployee.equals(testEmployee));
    }
}
