package lab6;

public class Square14 extends Rectangle14 {
    public Square14() {
        super();
    }

    public Square14(double side) {
        super(side, side);
    }

    public Square14(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }
    public void setSide(double side) {
        side = super.getLength();
    }

    public void SetWidth(double side) {
        side = super.getLength();
    }

    public void setLength(double side) {
        side = super.getLength();
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
