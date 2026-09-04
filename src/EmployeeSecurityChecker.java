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

        System.out.print("Security training completed? (yes/no): ");
        String securityTraining = scanner.nextLine();

        System.out.print("Phishing test passed? (yes/no): ");
        String phishingTest = scanner.nextLine();

        System.out.print("Password training completed? (yes/no): ");
        String passwordTraining = scanner.nextLine();

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

        String riskLevel;

        if (score == 3) {
            riskLevel = "LOW RISK";
        } else if (score == 2) {
            riskLevel = "MEDIUM RISK";
        } else {
            riskLevel = "HIGH RISK";
        }

        System.out.println();
        System.out.println("================================");
        System.out.println("Employee: " + employeeName);
        System.out.println("Security Score: " + score + "/3");
        System.out.println("Risk Level: " + riskLevel);
        System.out.println("================================");

        scanner.close();
    }
}
