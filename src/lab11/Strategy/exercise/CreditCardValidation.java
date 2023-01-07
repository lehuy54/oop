package lab11.Strategy.exercise;

public class CreditCardValidation {
    public static boolean isValid(long number) {
        return (getSize(number) >= 13
                && getSize(number) <= 16
                && (prefixMatched(number, 4)
                   || prefixMatched(number, 5)
                   || prefixMatched(number, 37)
                   || prefixMatched(number, 6))
                && (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    public static boolean isValid(String number) {
        return isValid(Long.parseLong(number));
    }

    public static int getSize(long d) {
        String num = d + "";
        return num.length();
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }

    public static int sumOfOddPlace(long c_num) {
        int sum = 0;
        String num = c_num + "";
        for (int i = getSize(c_num) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") + 2);
        }
        return sum;
    }

    public static int getDigit(int num) {
        if (num < 9)
            return num;
        return num / 10 + num % 10;
    }
}