package lab2;

import java.util.Scanner;
import java.util.Arrays;

public class GradesStatistics2 {
    public static int[] grades;

    public static void main(String []args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("%s%.2f%n","The average is: ", average(grades));
        System.out.printf("%s%.2f%n", "The median is: ", median(grades) );
        System.out.printf("%s%d%n", "The minimum is: ", min(grades));
        System.out.printf("%s%d%n", "The maximum is: ", max(grades));
    }

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int NUM_STUDENTS = sc.nextInt();
        grades = new int[NUM_STUDENTS];
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.printf("%s %d: ", "Enter the grade for student", i+1);
            grades[i] = sc.nextInt();
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i]);
            }
            else {
                System.out.printf("%s %d", ",", array[i]);
            }
        }
        System.out.printf("%s%n","]");
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = 1.0 * sum/array.length;
        return average;
    }

    public static double median(int[] array) {
        double median;
        Arrays.sort(array);
        if (array.length % 2 == 1) {
                median = array[(array.length - 1)/2];
        }
        else {
            median = (array[array.length/2] + array[array.length/2 - 1])/2;
        }
        return median;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
