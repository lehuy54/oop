package lab5;

public class Circle {
    private double radius;

    public Circle() { // default constructor
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { // getters
        return this.radius;
    }

    public void setRadius(double radius) { // setters
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this .radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("oop.Circle")
                .append("[")
                .append("radius")
                .append(this.radius)
                .append("]");

        return description.toString();
    }
}
