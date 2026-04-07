package ma.projectclasse.projects.company;

import java.time.LocalDate;

public abstract class Employee {

    private String name;
    private String firstName;
    private int age;
    private LocalDate hireDate;


    public Employee(String name, String firstName, int age, LocalDate hireDate) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.hireDate = hireDate;
    }

    public String getName() { return name; }
    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public LocalDate getHireDate() { return hireDate; }

    public abstract String getPosition();
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + name +
                ", Age: " + age +
                ", Hire date: " + hireDate +
                ", Position: " + getPosition() +
                ", Salary: " + calculateSalary() + " DH";
    }
}