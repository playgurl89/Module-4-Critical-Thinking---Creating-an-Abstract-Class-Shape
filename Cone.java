// Represents a cone defined by radius and height.
// Includes calculation of slant height for surface area.
public class Cone extends Shape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculates surface area using slant height formula
    // Surface area = πr(r + l), where l = sqrt(r² + h²)
    @Override
    public double surface_area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Volume = (1/3)πr²h
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cone [Radius: " + radius +
               ", Height: " + height +
               ", Surface Area: " + surface_area() +
               ", Volume: " + volume() + "]";
    }
}