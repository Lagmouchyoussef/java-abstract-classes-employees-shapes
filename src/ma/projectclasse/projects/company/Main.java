package ma.projectclasse.projects.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== EMPLOYEE MANAGEMENT ===\n");

        // Array to store employees
        Employee[] employees = new Employee[4];

        // 1. Creating a Salesperson
        System.out.println("--- Creating a Salesperson ---");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Monthly sales (DH): ");
        double monthlySales = scanner.nextDouble();
        scanner.nextLine(); // clear buffer

        employees[0] = new Salesperson(name, firstName, age, LocalDate.of(2020, 1, 15), monthlySales);

        // 2. Creating a Representative
        System.out.println("\n--- Creating a Representative ---");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("First name: ");
        firstName = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Monthly sales (DH): ");
        monthlySales = scanner.nextDouble();
        scanner.nextLine();

        employees[1] = new Representative(name, firstName, age, LocalDate.of(2019, 5, 10), monthlySales);

        // 3. Creating a Technician
        System.out.println("\n--- Creating a Technician ---");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("First name: ");
        firstName = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Number of units produced: ");
        int units = scanner.nextInt();
        scanner.nextLine();

        employees[2] = new Technician(name, firstName, age, LocalDate.of(2021, 3, 20), units);

        // 4. Creating a Handler
        System.out.println("\n--- Creating a Handler ---");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("First name: ");
        firstName = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Number of working hours: ");
        int hours = scanner.nextInt();

        employees[3] = new Handler(name, firstName, age, LocalDate.of(2022, 7, 1), hours);

        // Displaying results
        System.out.println("\n=== EMPLOYEE LIST ===\n");
        for (Employee e : employees) {
            System.out.println(e);
            System.out.println("---------------------------");
        }

        scanner.close();
    }
}