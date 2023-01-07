package lab4;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int n;
        int[] array;

        System.out.print("Enter the key: ");
        key = sc.nextInt();

        System.out.print("Enter the length of array: ");
        n = sc.nextInt();

        array = new int[n];
        System.out.print("Enter the length of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        selectionSort(array);

        System.out.print(binerySearch(array,key,0,n-1));
    }

    public static boolean binerySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            int middleIdx = (fromIdx + toIdx)/2;
            if (key == array[middleIdx]) {
                return true;
            }
            else if (key > array[middleIdx]) {
                fromIdx = middleIdx + 1;
            }
            else {
                toIdx = middleIdx - 1;
            }
        }
        return binerySearch(array,key,fromIdx,toIdx);
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                }
                if (min != array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
