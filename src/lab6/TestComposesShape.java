package lab6;

public class TestComposesShape {
    public static void main(String[] args) {
        Circle22 circle1 = new Circle22();
        System.out.println(circle1);

        circle1.setColor("Blue");
        circle1.setRadius(5);
        System.out.println(circle1);

        Cylinder22 cylinder1 = new Cylinder22();
        System.out.println(cylinder1);

        Circle22 circle2 = new Circle22(7,"Red");
        Cylinder22 cylinder2 = new Cylinder22(circle2,7);
        System.out.println(cylinder2);

    }
}
