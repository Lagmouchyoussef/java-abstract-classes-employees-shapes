package ma.projectclasse.projects.shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 3D SHAPES MANAGEMENT ===\n");

        // Creating a Brick
        System.out.println("--- Creating a Brick ---");
        System.out.print("Center X: ");
        double x = scanner.nextDouble();
        System.out.print("Center Y: ");
        double y = scanner.nextDouble();
        System.out.print("Center Z: ");
        double z = scanner.nextDouble();
        System.out.print("Density: ");
        double density = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        Brick brick = new Brick(new Point3D(x, y, z), density, width, length, height);

        // Creating a Cube
        System.out.println("\n--- Creating a Cube ---");
        System.out.print("Center X: ");
        x = scanner.nextDouble();
        System.out.print("Center Y: ");
        y = scanner.nextDouble();
        System.out.print("Center Z: ");
        z = scanner.nextDouble();
        System.out.print("Density: ");
        density = scanner.nextDouble();
        System.out.print("Side: ");
        double side = scanner.nextDouble();

        Cube cube = new Cube(new Point3D(x, y, z), density, side);

        // Displaying shapes
        System.out.println("\n=== DISPLAYING SHAPES ===\n");
        System.out.println(brick);
        System.out.println();
        System.out.println(cube);

        // Translation test
        System.out.println("\n=== TRANSLATION TEST ===\n");
        System.out.print("Enter dx to move the brick: ");
        double dx = scanner.nextDouble();
        System.out.print("Enter dy: ");
        double dy = scanner.nextDouble();
        System.out.print("Enter dz: ");
        double dz = scanner.nextDouble();

        brick.move(dx, dy, dz);
        System.out.println("Brick after translation: " + brick);

        // Verification that Cube cannot be inherited (demonstration)
        System.out.println("\n(Note: The Cube class is declared 'final', it cannot be inherited)");

        scanner.close();
    }
}