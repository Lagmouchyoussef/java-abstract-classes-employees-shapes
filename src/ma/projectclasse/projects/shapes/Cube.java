package ma.projectclasse.projects.shapes;

public final class Cube extends Brick {
    // Constructor - a cube has width = length = height = side
    public Cube(Point3D centerOfGravity, double density, double side) {
        super(centerOfGravity, density, side, side, side);
    }

    // Specific method to get the side size
    public double getSide() {
        return getWidth(); // or getLength() or getHeight()
    }

    @Override
    public String toString() {
        return "Cube [" + super.toString() + "]";
    }
}