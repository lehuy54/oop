package lab11.Strategy.Example;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
//        ConcreateStrategyAdd concreateStrategyAdd = new ConcreateStrategyAdd();
        int strategyId = 1;
        if (strategyId == 1) {
            context.setStrategy(new ConcreateStrategyAdd());
        } else if (strategyId == 2) {
            context.setStrategy(new ConcreateStrategyMultiply());
        } else {
            context.setStrategy(new ConcreateStrategySubtract());
        }
        System.out.println(context.executeStrategy(2,3) + "");
    }
}
