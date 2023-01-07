package lab4;

import java.util.Scanner;

public class BubbleSort {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int[] array;

        System.out.print("Enter the length of array: ");
        n = sc.nextInt();

        array = new int[n];
        System.out.print("Enter the elements of array: ");
        inputArray(array);

        bubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            n--;
        }
        while (swapped == true);
    }

}
