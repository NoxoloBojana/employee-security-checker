package za.co.wethinkcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecurityReportTest {

    @Test
    void shouldShowCorrectEmployeeName() {

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                false
        );

        assertEquals("Noxolo", employee.getName());
    }

    @Test
    void shouldShowSecurityTrainingAsPassed() {

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                false
        );

        assertEquals(true, employee.isSecurityTrainingCompleted());
    }

    @Test
    void shouldShowPhishingTestAsPassed() {

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                false
        );

        assertEquals(true, employee.isPhishingTestPassed());
    }

    @Test
    void shouldShowPasswordTrainingAsFailed() {

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                false
        );

        assertEquals(false, employee.isPasswordTrainingCompleted());
    }
}


