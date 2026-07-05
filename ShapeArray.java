// Driver class that demonstrates polymorphism using an array of Shape objects.
// Creates one instance of each shape and prints their computed values.
public class ShapeArray {

    public static void main(String[] args) {

        // Create one instance of each shape
        Sphere sphere = new Sphere(5.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        Cone cone = new Cone(4.0, 6.0);

        // Store shapes in an array to demonstrate polymorphism
        Shape[] shapeArray = { sphere, cylinder, cone };

        // Loop through array and print each shape's details using toString()
        for (Shape shape : shapeArray) {
            System.out.println(shape);
            System.out.println();
        }
    }
}