package ma.projectclasse.projects.company;

import java.time.LocalDate;

public class Technician extends Employee {
    // Specific attribute
    private int unitsProduced;

    // Constructor
    public Technician(String name, String firstName, int age, LocalDate hireDate, int unitsProduced) {
        super(name, firstName, age, hireDate);
        this.unitsProduced = unitsProduced;
    }

    public int getUnitsProduced() { return unitsProduced; }

    @Override
    public String getPosition() {
        return "Technician - Production Department";
    }

    @Override
    public double calculateSalary() {
        // Number of units * 5
        return unitsProduced * 5;
    }
}