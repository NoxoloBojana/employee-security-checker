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
}
