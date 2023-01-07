package lab1;

import java.util.Locale;
import java.util.Scanner;
public class CountVowelsDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inStr = sc.nextLine().toLowerCase(Locale.ROOT);
        int len = inStr.length();
        int digit = 0;
        int charac = 0;
        for (int i = 0; i < len; i++){
            if ( inStr.charAt(i) == 'u' || inStr.charAt(i) == 'e' || inStr.charAt(i) == 'o' || inStr.charAt(i) == 'a' || inStr.charAt(i) == 'i' ){
                charac++;
            } else if ( Character.isDigit(inStr.charAt(i)) ){
                digit++;
            }
        }
        double numD =  ((double)digit / (double)len)*100.0;
        double numC =  ((double)charac / (double)len)*100.0;

        System.out.printf("Number of digits:  %d (%.2f %%) ", digit, numD);
        System.out.println();
        System.out.printf("Number of vowels:  %d (%.2f %%)", charac, numC);

    }
}
