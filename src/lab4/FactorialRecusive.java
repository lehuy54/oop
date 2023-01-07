package lab4;

public class FactorialRecusive {
    public static void main(String[] args) {
        System.out.print(factorial(15));
        //factorial(4)
        //4 * factorial(3)
        //3 * factorial(2)
        //2 * factorial(1)
        //1 * factorial(0)
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
