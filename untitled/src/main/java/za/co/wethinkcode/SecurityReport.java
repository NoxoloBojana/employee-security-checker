package za.co.wethinkcode;

public class SecurityReport {

    public void displayReport(Employee employee, int score, String riskLevel) {

        System.out.println();
        System.out.println("================================");
        System.out.println("       SECURITY REPORT");
        System.out.println("================================");

        System.out.println("Employee: " + employee.getName());

        System.out.println("Security Training: "
                + (employee.isSecurityTrainingCompleted() ? "PASSED" : "FAILED"));

        System.out.println("Phishing Test: "
                + (employee.isPhishingTestPassed() ? "PASSED" : "FAILED"));

        System.out.println("Password Training: "
                + (employee.isPasswordTrainingCompleted() ? "PASSED" : "FAILED"));

        System.out.println();
        System.out.println("Security Score: " + score + "/3");
        System.out.println("Risk Level: " + riskLevel);

        System.out.println("================================");
    }
}
