package lab3;

import java.util.Scanner;

public class TrigonometricSeries {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the terms: ");
        int n = sc.nextInt();
        System.out.printf("%s%f%s = %f%n", "sin(", x, ")", sin(Math.PI/3,n));
        System.out.printf("%s %f%n%n", "Test JDK Methods Math.sin():", Math.sin(Math.PI/3));

        System.out.printf("%s%f%s = %f%n", "cos(", x, ")", cos(x,n));
        System.out.printf("%s %f%n", "Test JDK Methods Math.cos():", Math.cos(Math.PI/3));
    }
    public static double sin(double x, int numTerms) {
        double sin = 0;
        for (int i = 1, a = 1, d = 1; i <= numTerms; i++, a +=2, d +=2) {
            int fact = 1;
            for (int j = 1; j <= d; j++) {
                    fact *= j;
            }
            if (i % 2 == 1) {
                sin += (double) Math.pow(x,a) / fact;
            }
            else {
                sin -= (double) Math.pow(x,a) / fact;
            }
        }
        return sin;
    }
    public static double cos(double x, int numTerms) {
        double sum = 0;
        for (int i = 1, a = 2; i <= numTerms; i++, a += 2) {
            int fact = 1;
            for (int j = 1; j <= a; j++) {
                fact *= j;
            }
            if (i % 2 == 1) {
                sum -= (double) Math.pow(x,a)/fact;
            }
            else {
                sum += (double) Math.pow(x,a)/fact;
            }
        }
        double cos = 1 + sum;
        return cos;
    }
}
