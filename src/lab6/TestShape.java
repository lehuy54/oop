package lab6;

public class TestShape {
    public static void main(String[] args) {
        Circle shape;
        shape = new Circle();

        System.out.println(shape);
        System.out.println(shape.getArea());

        shape = new Cylinder();
        System.out.println(shape);
        System.out.println(shape.getArea());
    }
}
