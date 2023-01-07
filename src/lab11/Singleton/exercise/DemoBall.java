package lab11.Singleton.exercise;

public class DemoBall {
    public static void main(String[] args) {
        Ball ball1 = Ball.getInstance("red");
        System.out.println(ball1.getColor());

        Ball ball2 = Ball.getInstance("blue");
        System.out.println(ball2.getColor());

        Ball ball3 = Ball.getInstance("blue");
        System.out.println(ball2 == ball3);
    }
}
