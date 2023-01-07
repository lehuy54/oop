package lab6;

public class Circle14 extends Shape {
    private double radius;

    public Circle14() {
        this.radius = 1.0;
    }

    public Circle14(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter () {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString()
                + ",radius= " + this.radius;
    }
}
