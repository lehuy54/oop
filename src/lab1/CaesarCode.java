package lab1;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String in = sc.nextLine().toUpperCase();
        int len = in.length();
        for (int i = 0; i < len; i++){
            if ( in.charAt(i) == 'X' || in.charAt(i) == 'Y' || in.charAt(i) == 'Z' ){
                System.out.print((char) (in.charAt(i) - 23));
            } else {
                System.out.print((char) (in.charAt(i) + 3));
            }
        }
    }
}
