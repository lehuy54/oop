package lab3;

import java.util.Scanner;

public class SpecialSeries {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the terms: ");
        int n = sc.nextInt();
        System.out.print("The result of Exponential Series is: " + specialSeries(x,n));
    }

    public static double specialSeries(double x, int numTerms) {
        if (!(x >= -1 && x <= 1)) {
            return -1;
        }
        else {
            double sum = 0;
            for (int i = 1, a = 3; i <= numTerms; i++, a += 2) {
                int numerator = 1;
                int denominator = 1;
                for (int j = 1, k = 2; j <= a - 2; j += 2, k += 2) {
                    numerator *= j;
                    denominator *= k;
                }
                sum += numerator / denominator * Math.pow(x, a) / a;
            }
            return x + sum;
        }
    }
}
