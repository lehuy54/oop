package lab6;

public class Cylinder extends Circle {
    private double height;

    public Cylinder () {
        this.height = 1.0;
    }

    public Cylinder (double height) {
        super("White", 1.0);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * super.getArea()
                + this.getCircumference() * this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString()
                + ", height: " + this.height
                + ", volume: " + this.getVolume()
                + "]";
    }
}
