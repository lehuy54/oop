package lab6;

public class Circle {
    protected double radius;
    protected String color;

    public Circle () {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle (String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference () {
        return 2 * this.radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius " + this.radius
                + ", color: " + this.color
                + ", area: " + this.getArea()
                + ", circumference: " + this.getCircumference()
                + "]";
    }
}
