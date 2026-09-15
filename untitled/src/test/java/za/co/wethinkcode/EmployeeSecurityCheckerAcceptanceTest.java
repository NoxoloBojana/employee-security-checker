package za.co.wethinkcode;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeSecurityCheckerAcceptanceTest {

    @Test
    void shouldCompleteFullSecurityCheckForEmployee() {

        // Pretend the user enters these answers
        String userInput =
                "Noxolo\n" +
                        "yes\n" +
                        "yes\n" +
                        "yes\n";

        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        // Capture what the program prints
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // Run the whole application
        EmployeeSecurityChecker.main(new String[]{});

        String result = output.toString();

        // Check the final result
        assertTrue(result.contains("Employee: Noxolo"));
        assertTrue(result.contains("Security Score: 3/3"));
        assertTrue(result.contains("Risk Level: LOW RISK"));
    }

    @Test
    void shouldIdentifyHighRiskEmployee() {

        String userInput =
                "Noxolo\n" +
                        "yes\n" +
                        "no\n" +
                        "no\n";

        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        EmployeeSecurityChecker.main(new String[]{});

        String result = output.toString();

        assertTrue(result.contains("Employee: Noxolo"));
        assertTrue(result.contains("Security Score: 1/3"));
        assertTrue(result.contains("Risk Level: HIGH RISK"));
    }
}
