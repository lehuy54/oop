package lab5;

public class Circle1 {
    private double radius;
    private String color;

    public Circle1() { // default constructor
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() { // getters
        return this.radius;
    }

    public void setRadius(double radius) { // setters
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "oop.Circle[radius = " + radius + " color = " + color + "]";
    }
}
