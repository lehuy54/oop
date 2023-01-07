package lab4;

public class GCD {
    public static void main(String[] args) {
        System.out.print(gcd(88,99));
    }
    public static int gcd(int a, int b) {
     if (a >= b) {
         while ( b != 0) {
             int temp = b;
             b = a % b;
             a = temp;
         }
         return a;
     }
     if (b >= a) {
         while (a != 0) {
             int temp = a;
             a = b % a;
             b = temp;
         }
         return b;
     }
     return -1;
    }
}
