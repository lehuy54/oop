package lab1;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String in = sc.nextLine();
        sc.close();

        int len = in.length();
        boolean bool = true;
        for (int i=0; i<len; i++){
            if ( !( (in.charAt(i) >= '0') && (in.charAt(i) <= '9')
                    || (in.charAt(i) >= 'A') && (in.charAt(i) <= 'F')
                    || (in.charAt(i) >= 'a') && (in.charAt(i) <= 'f' ))){
                bool = false;
                break;
            }
        }
        if (bool){
            System.out.print(in + " is a hex string");
        } else {
            System.out.print(in + " is NOT a hex string");
        }
    }
}
