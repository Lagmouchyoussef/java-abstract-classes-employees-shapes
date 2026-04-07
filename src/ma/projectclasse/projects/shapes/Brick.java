package ma.projectclasse.projects.shapes;

public class Brick extends Shape {
    // Specific attributes
    private double width;
    private double length;
    private double height;

    // Constructor
    public Brick(Point3D centerOfGravity, double density, double width, double length, double height) {
        super(centerOfGravity, density);
        this.width = width;
        this.length = length;
        this.height = height;
    }

    // Getters
    public double getWidth() { return width; }
    public double getLength() { return length; }
    public double getHeight() { return height; }

    @Override
    public double calculateSurface() {
        // Surface = width x length (base surface)
        return width * length;
    }

    @Override
    public double calculateVolume() {
        // Volume = width x length x height
        return width * length * height;
    }

    @Override
    public String toString() {
        return "Brick [" + super.toString() +
                ", Width: " + width +
                ", Length: " + length +
                ", Height: " + height + "]";
    }
}