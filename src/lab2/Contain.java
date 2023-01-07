package lab2;

import java.util.Scanner;

public class Contain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int[] array;

        System.out.print("Enter the given number: ");
        key = sc.nextInt();
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        array = new int[size];
        System.out.print("Enter the element: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        if (contains(array,key)) {
            System.out.print("Contain!");
        }
        else {
            System.out.print("No contain!");
        }
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return true;
        }
        return false;
    }
}
