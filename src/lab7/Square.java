package lab7;

public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(color,filled,side,side);
    }
    public double getSide() {
        return super.getLength();
    }
    public void setSide(double side) {
        side = super.getLength();
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
