package lab7;

public class Circle2 implements GeometricObject{
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + this.radius + "]";
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
