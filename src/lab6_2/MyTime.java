package lab6_2;

public class MyTime {
    protected int hour;
    protected int minutes;
    protected int second;

    public MyTime() {
        this.hour = 0;
        this.minutes = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }
    public void setTime(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public static String format(int in){
        return in<10 ? "0" + in : "" + in;
    }

    @Override
    public String toString() {
        return format(this.hour) + ":" + format(this.minutes) + ":" + format(this.second);
    }

    public MyTime nextSecond() {
        if (this.second == 59) {
            this.second = 0;
            nextMinute();
            return this;
        }
        second++;
        return this;
    }
    public MyTime nextMinute() {
        if (this.minutes == 59) {
            this.minutes = 0;
            nextHour();
            return this;
        }
        minutes++;
        return this;
    }

    public MyTime nextHour() {
        if (this.hour == 23) {
            this.hour = 0;
            return this;
        }
        hour++;
        return this;
    }

    public MyTime previousSecond() {
        if (this.second == 0) {
            this.second = 60;
            previousMinutes();
            return this;
        }
        second--;
        return this;
    }

    public MyTime previousMinutes() {
        if (this.minutes == 0) {
            this.minutes = 59;
            previousHour();
            return this;
        }
        minutes--;
        return this;
    }
        public MyTime previousHour() {
            if (this.hour == 0) {
                this.hour = 23;
                return this;
            }
            hour--;
            return this;
        }
}
