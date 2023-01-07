package lab2;

import java.util.Scanner;

public class PrintArray {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS;
        int[] items;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items: ");
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
            sc.close();

            System.out.print("The values are: ");
            for (int i = 0; i < items.length; i++) {
                if (i == 0) {
                    System.out.printf("[%d", items[i]);
                }
                else {
                    System.out.printf(", %d", items[i]);
                }
            }
            System.out.print("]");
        }
    }
}
