package lab4;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(linearSearch(array,key));
        System.out.print(linearSearchIndex(array,key));
    }
    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
