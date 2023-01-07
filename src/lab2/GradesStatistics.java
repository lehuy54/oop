package lab2;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudent;
        int[] grades;
        int sum = 0;
        System.out.print("Enter the number of studens: ");
        numStudent = sc.nextInt();

        grades = new int[numStudent];
        for (int student = 0; student < numStudent; student++) {
            System.out.printf("%s %d%s ","Enter the grade for student", student+1, ":");
            grades[student] = sc.nextInt();
        }

        for (int grade = 0; grade < numStudent; grade++) {
            sum += grades[grade];
        }
        double average = 1.0 * sum/numStudent;
        System.out.printf("%s %.2f%n","The average is:" , average);

        int min = grades[0];
        for (int i = 0; i < numStudent; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        System.out.println("The minimmum is : " + min);

        int max = grades[0];
        for (int i = 0; i < numStudent; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        System.out.print("The maximum is: " + max);
    }
}
