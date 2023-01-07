package lab6;

public class Circle22 {
    protected double radius;
    protected String color;

    public Circle22() {
        this.radius = 3.0;
        this.color = "White";
    }
    public Circle22(double radius, String color) {
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

    @Override
    public String toString() {
        return "Circle[radius = " + this.radius + ", color = " + this.color + "]";
    }
}
