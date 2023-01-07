package lab6;

public class Cylinder22 {
    private Circle22 base;
    private double height;

    public Cylinder22() {
        base = new Circle22();
        height = 1.0;
    }

    public Cylinder22 (Circle22 base, double height) {
        this.base = base;
        this.height = height;
    }

    public Cylinder22 (double radius, String color, double height) {
        base = new Circle22(radius,color);
    }

    @Override
    public String toString() {
        return "Cylinder[" + base + ", height = " + this.height + "]";
    }
}
