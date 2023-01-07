package lab4;

import java.util.Scanner;

public class RNSLengthRecusive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(len(i) + "" + numOfDigits(i));
        }
    }
    public static int numOfDigits(int n) {
        if (n == 1) {
            return 1;
        }
        return numOfDigits(n);
    }
        public static int len(int n) {
            if (n == 1) {
                return 1;
            }
            return len(n-1);
        }
}
