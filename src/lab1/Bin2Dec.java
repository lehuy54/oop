package lab1;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String in = sc.nextLine();
        int len = in.length();
        boolean bool = true;
        int num = 0;
        for (int i = 0; i < len; i++){
            if ( in.charAt(i) != '0' && in.charAt(i) != '1' ){
                bool = false;
                break;
            } else if ( in.charAt(i) == '1' ){
                num = num + (int)Math.pow(2, (len - i - 1));
            }
        }
        if (bool){
            System.out.print(in + " is " + num);
        } else {
            System.out.print("Not a decimal number");
        }
        sc.close();
    }
}
