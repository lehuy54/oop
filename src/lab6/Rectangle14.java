package lab6;

public class Rectangle14 extends Shape{
    private double width;
    private double length;

    public Rectangle14() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle14(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle14(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
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

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter () {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString()
                + ", width= " + this.width
                + ", length= " + this.length
                + "]";
    }
}
