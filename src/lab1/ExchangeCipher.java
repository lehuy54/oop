package lab1;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String in = sc.nextLine().toUpperCase();
        int len = in.length();
        for (int i = 0; i < len; i++){
            System.out.print((char) ('A' + 'Z' - in.charAt(i)));
        }
    }
}
