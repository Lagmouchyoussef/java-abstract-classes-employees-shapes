package ma.projectclasse.projects.company;

import java.time.LocalDate;

public class Representative extends Employee {
    // Specific attribute
    private double monthlySales;

    // Constructor
    public Representative(String name, String firstName, int age, LocalDate hireDate, double monthlySales) {
        super(name, firstName, age, hireDate);
        this.monthlySales = monthlySales;
    }

    public double getMonthlySales() { return monthlySales; }

    @Override
    public String getPosition() {
        return "Representative - Sales Department";
    }

    @Override
    public double calculateSalary() {
        // 20% of sales + 2000 DH
        return (monthlySales * 0.20) + 2000;
    }
}