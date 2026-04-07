package ma.projectclasse.projects.shapes;

public abstract class Shape {
    // Attributes
    protected Point3D centerOfGravity;
    protected double density;

    // Constructor
    public Shape(Point3D centerOfGravity, double density) {
        this.centerOfGravity = centerOfGravity;
        this.density = density;
    }

    // Move method - translates the center of gravity
    public void move(double dx, double dy, double dz) {
        centerOfGravity.move(dx, dy, dz);
    }

    // Abstract methods
    public abstract double calculateSurface();
    public abstract double calculateVolume();

    // Calculate weight method (not abstract because formula is identical for all)
    public double calculateWeight() {
        return calculateVolume() * density;
    }

    @Override
    public String toString() {
        return "Center of gravity: " + centerOfGravity +
                ", Density: " + density +
                ", Volume: " + calculateVolume() +
                ", Surface: " + calculateSurface() +
                ", Weight: " + calculateWeight();
    }
}