package lab11.Strategy.Example;

public class ConcreateStrategyAdd implements Strategy{
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
