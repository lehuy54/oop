package lab4;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("Enter the upper bound: ");
        int upperbound = sc.nextInt();
        System.out.print("These numbers are equal to the product of prime factors: ");
        for (int i = 1; i <= upperbound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                a++;
            }
        }
        double apercent = ((double)a/(double)upperbound)*100.0;
        System.out.printf("\n[%d %s (%.2f%%)]", a, "numbers found", apercent);
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        else {
            for (int i = 2; i < aPosInt; i++) {
                if (aPosInt % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
            for (int i = 2; i < aPosInt; i++) {
                if (isPrime(i) && aPosInt % i == 0) {
                    product *= i;
                }
            }
            if (product == aPosInt) {
                return true;
            }
            return false;
    }
}
