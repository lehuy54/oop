package lab7;

public class Circle3 implements GeometricObject {
    protected double radius;

    public Circle3(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circles[radius = " + this.radius + "]";
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }




}
