// Represents a cylinder with radius and height.
// Implements surface area and volume calculations.
public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Surface area = 2πrh + 2πr² (lateral area + top/bottom)
    @Override
    public double surface_area() {
        return (2 * Math.PI * radius * height) +
               (2 * Math.PI * radius * radius);
    }

    // Volume = πr²h
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder [Radius: " + radius +
               ", Height: " + height +
               ", Surface Area: " + surface_area() +
               ", Volume: " + volume() + "]";
    }
}