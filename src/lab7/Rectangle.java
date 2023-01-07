package lab7;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double height) {
        this.length = height;
    }

    double getArea() {
        return 0;
    }
    double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width = " + this.width + ",height = " + this.length + "]";
    }
}
