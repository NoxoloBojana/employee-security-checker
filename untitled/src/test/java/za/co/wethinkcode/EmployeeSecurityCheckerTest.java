package za.co.wethinkcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeSecurityCheckerTest {

    @Test
    void shouldReturnLowRiskForScoreThree() {

        String result = EmployeeSecurityChecker.getRiskLevel(3);

        assertEquals("LOW RISK", result);
    }

    @Test
    void shouldReturnMediumRiskForScoreTwo() {

        String result = EmployeeSecurityChecker.getRiskLevel(2);

        assertEquals("MEDIUM RISK", result);
    }

    @Test
    void shouldReturnHighRiskForScoreOne() {

        String result = EmployeeSecurityChecker.getRiskLevel(1);

        assertEquals("HIGH RISK", result);
    }

    @Test
    void shouldReturnHighRiskForScoreZero() {

        String result = EmployeeSecurityChecker.getRiskLevel(0);

        assertEquals("HIGH RISK", result);
    }

    @Test
    void shouldCalculateScoreThreeWhenAllChecksPass() {

        SecurityChecker securityChecker = new SecurityChecker();

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                true
        );

        int score = securityChecker.calculateScore(employee);

        assertEquals(3, score);
    }

    @Test
    void shouldCalculateScoreTwoWhenTwoChecksPass() {

        SecurityChecker securityChecker = new SecurityChecker();

        Employee employee = new Employee(
                "Noxolo",
                true,
                true,
                false
        );

        int score = securityChecker.calculateScore(employee);

        assertEquals(2, score);
    }

    @Test
    void shouldCalculateScoreOneWhenOneCheckPasses() {

        SecurityChecker securityChecker = new SecurityChecker();

        Employee employee = new Employee(
                "Noxolo",
                true,
                false,
                false
        );

        int score = securityChecker.calculateScore(employee);

        assertEquals(1, score);
    }

    @Test
    void shouldCalculateScoreZeroWhenNoChecksPass() {

        SecurityChecker securityChecker = new SecurityChecker();

        Employee employee = new Employee(
                "Noxolo",
                false,
                false,
                false
        );

        int score = securityChecker.calculateScore(employee);

        assertEquals(0, score);
    }
}


