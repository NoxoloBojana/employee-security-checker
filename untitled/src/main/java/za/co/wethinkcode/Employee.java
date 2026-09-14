package za.co.wethinkcode;

public class Employee {

    private String name;
    private boolean securityTrainingCompleted;
    private boolean phishingTestPassed;
    private boolean passwordTrainingCompleted;

    public Employee(String name,
                    boolean securityTrainingCompleted,
                    boolean phishingTestPassed,
                    boolean passwordTrainingCompleted) {

        this.name = name;
        this.securityTrainingCompleted = securityTrainingCompleted;
        this.phishingTestPassed = phishingTestPassed;
        this.passwordTrainingCompleted = passwordTrainingCompleted;
    }

    public String getName() {
        return name;
    }

    public boolean isSecurityTrainingCompleted() {
        return securityTrainingCompleted;
    }

    public boolean isPhishingTestPassed() {
        return phishingTestPassed;
    }

    public boolean isPasswordTrainingCompleted() {
        return passwordTrainingCompleted;
    }
}