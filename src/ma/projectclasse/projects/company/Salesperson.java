package ma.projectclasse.projects.company;

import java.time.LocalDate;

public class Salesperson extends Employee {
    // Specific attribute
    private double monthlySales;

    // Constructor
    public Salesperson(String name, String firstName, int age, LocalDate hireDate, double monthlySales) {
        super(name, firstName, age, hireDate);
        this.monthlySales = monthlySales;
    }

    // Getter
    public double getMonthlySales() { return monthlySales; }

    @Override
    public String getPosition() {
        return "Salesperson - Sales Department";
    }

    @Override
    public double calculateSalary() {
        // 20% of sales
        return monthlySales * 0.20;
    }
}