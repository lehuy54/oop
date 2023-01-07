package lab4;

import java.util.Scanner;

public class GCDRecursive {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();

        System.out.print("GCD of 2 numbers is: " + gcd(num1,num2));
    }

    public static int gcd(int num1, int num2) {
        if (num1 % num2 == 0){
            return num2;
        }
        else {
            return gcd(num2, num1 % num2);
        }
    }
}
