package lab3;

public class FactorialInt {
    public static void main(String[] args) {
        int fact = 1;
        int n = 13;
        for (int i = 1; i <= 12; i++) {
            fact *= i;
                System.out.printf("%s%d is %d%n", "The factorial of ", i, fact);
                if ((Integer.MAX_VALUE / fact) < i + 1) {
                    System.out.printf("%s%d is %s", "The factorial of ", i + 1, "out of range");
                }
        }
    }
}

