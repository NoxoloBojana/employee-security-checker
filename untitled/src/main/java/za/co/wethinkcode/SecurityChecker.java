package za.co.wethinkcode;

public class SecurityChecker {

    public int calculateScore(Employee employee) {

        int score = 0;

        if (employee.isSecurityTrainingCompleted()) {
            score++;
        }

        if (employee.isPhishingTestPassed()) {
            score++;
        }

        if (employee.isPasswordTrainingCompleted()) {
            score++;
        }

        return score;
    }
}




