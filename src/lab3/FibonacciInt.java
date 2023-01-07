package lab3;

public class FibonacciInt {
    public static void main(String[]args){
        int fibonacci = 1;
        int last1 = 1;
        int last2 = 1;
        int n = 2;

        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        while (Integer.MAX_VALUE-fibonacci > last2) {
            fibonacci = last1 + last2;
            last2 = last1;
            last1 = fibonacci;
            System.out.printf("F(%d) = %d%n", n, fibonacci);
            n++;
        }
        System.out.printf("F(%d) %s", n, "is out of range");
    }
}