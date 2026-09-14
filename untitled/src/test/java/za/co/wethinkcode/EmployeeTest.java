package za.co.wethinkcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmployeeTest {

    @Test
    void shouldStoreEmployeeName() {

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                false
        );

        assertEquals("Noxolo", employee.getName());
    }

    @Test
    void shouldStoreSecurityTrainingStatus() {

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                false
        );

        assertTrue(employee.isSecurityTrainingCompleted());
    }

    @Test
    void shouldStorePhishingTestStatus() {

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                false
        );

        assertTrue(employee.isPhishingTestPassed());
    }

    @Test
    void shouldStorePasswordTrainingStatus() {

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                false
        );

        assertFalse(employee.isPasswordTrainingCompleted());
    }
}
