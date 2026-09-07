import java.util.Scanner;

public class EmployeeSecurityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   EMPLOYEE SECURITY CHECKER");
        System.out.println("================================");

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.println("Employee: " + employeeName);

        // Security training
        String securityTraining;

        while (true) {
            System.out.print("Security training completed? (yes/no): ");
            securityTraining = scanner.nextLine();

            if (securityTraining.equalsIgnoreCase("yes") ||
                    securityTraining.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("Please enter yes or no.");
        }

        // Phishing test
        String phishingTest;

        while (true) {
            System.out.print("Phishing test passed? (yes/no): ");
            phishingTest = scanner.nextLine();

            if (phishingTest.equalsIgnoreCase("yes") ||
                    phishingTest.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("Please enter yes or no.");
        }

        // Password training
        String passwordTraining;

        while (true) {
            System.out.print("Password training completed? (yes/no): ");
            passwordTraining = scanner.nextLine();

            if (passwordTraining.equalsIgnoreCase("yes") ||
                    passwordTraining.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("Please enter yes or no.");
        }

        // Calculate score
        int score = 0;

        if (securityTraining.equalsIgnoreCase("yes")) {
            score++;
        }

        if (phishingTest.equalsIgnoreCase("yes")) {
            score++;
        }

        if (passwordTraining.equalsIgnoreCase("yes")) {
            score++;
        }

        // Decide risk level
        String riskLevel;

        if (score == 3) {
            riskLevel = "LOW RISK";
        } else if (score == 2) {
            riskLevel = "MEDIUM RISK";
        } else {
            riskLevel = "HIGH RISK";
        }

        // Display result
        System.out.println();
        System.out.println("================================");
        System.out.println("Employee: " + employeeName);
        System.out.println("Security Score: " + score + "/3");
        System.out.println("Risk Level: " + riskLevel);
        System.out.println("================================");

        scanner.close();
    }
}
