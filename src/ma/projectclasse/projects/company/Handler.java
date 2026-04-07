package ma.projectclasse.projects.company;

import java.time.LocalDate;

public class Handler extends Employee {
    // Specific attribute
    private int workingHours;

    // Constructor
    public Handler(String name, String firstName, int age, LocalDate hireDate, int workingHours) {
        super(name, firstName, age, hireDate);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() { return workingHours; }

    @Override
    public String getPosition() {
        return "Handler - Handling Department";
    }

    @Override
    public double calculateSalary() {
        // Hours * 500 DH
        return workingHours * 500;
    }
}