package za.co.wethinkcode;

public class SecurityChecker {

    public int calculateScore(
            String securityTraining,
            String phishingTest,
            String passwordTraining) {

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

        return score;
    }
}




