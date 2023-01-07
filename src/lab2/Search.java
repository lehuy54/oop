package lab2;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int[] array;

        System.out.print("Enter the given number: ");
        key = sc.nextInt();
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        array = new int[size];
        if (array.length != 0) {
            System.out.print("Enter the element: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
        }
        sc.close();
        System.out.print(search(array,key));
    }

    public static int search (int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
