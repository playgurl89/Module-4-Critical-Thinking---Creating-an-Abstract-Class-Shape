// Represents a sphere and implements calculations for surface area and volume.
// Uses radius as the single defining attribute.
public class Sphere extends Shape {

    private double radius;

    // Constructor initializes sphere with a given radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Calculates surface area of a sphere using formula: 4πr²
    @Override
    public double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    // Calculates volume of a sphere using formula: (4/3)πr³
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere [Radius: " + radius +
               ", Surface Area: " + surface_area() +
               ", Volume: " + volume() + "]";
    }
}