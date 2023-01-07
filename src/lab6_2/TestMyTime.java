package lab6_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime mytime1 = new MyTime(23,59,03);
        System.out.println(mytime1);
        mytime1.nextMinute();
        mytime1.nextSecond();
        mytime1.nextHour();
        System.out.println(mytime1);
    }
}
