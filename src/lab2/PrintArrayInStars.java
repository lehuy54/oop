package lab2;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_ITEMS;
        int[] items;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items: ");
        if (items.length > 0) {
            for ( int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        sc.close();

            for ( int idx = 0; idx < items.length; idx++ ) {
                System.out.print(idx + ": ");
                for ( int starNo = 1; starNo <= items[idx]; starNo++ ) {
                    System.out.print("*");
                }
                System.out.printf("(%d)%n", items[idx]);
            }
        }
    }
}
