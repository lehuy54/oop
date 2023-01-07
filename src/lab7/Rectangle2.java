package lab7;

public class Rectangle2 {
    private double width;
    private double length;

    public Rectangle2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[width = " + width + "length" + length + "]";
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}
