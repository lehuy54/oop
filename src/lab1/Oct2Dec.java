package lab1;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        int result = 0;
        int tempInt;
        char temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal string: ");
        String in = sc.nextLine();
        int len = in.length();

        for(int power = 0; power < len; power++) {
            temp = in.charAt(len - 1 - power);
            tempInt = Integer.valueOf(temp);
            result += tempInt * Math.pow(8,power);
        }
        System.out.println("The decimal equivalent is: " + result);
    }
}