package lab6_2;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
                            "Thursday", "Friday", "Saturday"};
    private int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else return false;
    }

    public boolean isValidDate (int year, int month, int day) {
        if (year < 1 || year > 9999 || day < 1 || day > 31) {
            return false;
        }
        if (isLeapYear(year) && month == 2 && day <= 29) {
            return true;
        }
        return day <= DAYS_IN_MONTHS[month - 1] ? true : false;
    }

    public int getDayOfWeek(int year, int month, int day) {
        int centuryCode = 0;
        switch ((year / 100) % 4) {
            case 1 -> centuryCode = 4;
            case 2 -> centuryCode = 2;
            case 3 -> centuryCode = 0;
            case 0 -> centuryCode = 6;
        }
        int yearLastTwoDigit = year - (year / 100) * 100;
        int yearCode = yearLastTwoDigit / 4;
        int monthCode = 0;
        switch (month) {
            case 3, 11 -> monthCode = 3;
            case 4, 7 -> monthCode = 6;
            case 5 -> monthCode = 1;
            case 6 -> monthCode = 4;
            case 8 -> monthCode = 2;
            case 9, 12 -> monthCode = 5;
            case 10 -> monthCode = 0;
        }
        if (!isLeapYear(year)) {
            switch (month) {
                case 1 -> monthCode = 0;
                case 2 -> monthCode = 3;
            }
        } else {
            switch (month) {
                case 1 -> monthCode = 6;
                case 2 -> monthCode = 2;
            }
        }
        return (centuryCode + yearLastTwoDigit + yearCode + monthCode + day) % 7;
    }

    public MyDate(int year, int month, int day) {
        try {
            if (isValidDate(year,month,day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            }
            else throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid year, month or day!");
        }
    }

    public void setDate(int year, int month, int day) {
        try {
            if (isValidDate(year,month,day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid year, month or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        try {
            if (year >= 1 && year <= 9999) {
                this.year = year;
            }
            else throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        try {
            if (month >= 1 && month <= 12) {
                this.month = month;
            }
            else throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        try {
            if (isValidDate(year,month,day)) {
                this.day = day;
            }
            else throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid day!");
        }
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append(DAYS[getDayOfWeek(year,month,day)])
                .append(" ")
                .append(this.day)
                .append(" ")
                .append(MONTHS[month - 1])
                .append(" ")
                .append(this.year);
        return description.toString();
    }
    public MyDate nextDay() {
        if (day == 31) {
            nextMonth();
        }
        if (day == 28 && month == 2 && !isLeapYear(year)) {
            day = 1;
            nextMonth();
        }
        else if (day == 29 && month == 2 && isLeapYear(year)) {
            day =  1;
            nextMonth();
        }
        else {
            day++;
        }
        return this;
    }
    public MyDate nextMonth() {
        if (month == 12) {
            year++;
        }
        month++;
        if (day == 31 && (month == 3 || month == 5 || month == 8 || month == 10)) day = 30;
        else if (day == 31 && month == 1 && isLeapYear(year)) day = 29;
        else if (day == 31 && month == 1 && !isLeapYear(year)) day = 28;
        return this;
    }
    public MyDate nextYear() {
        if (year == 9999) {
            throw new IllegalStateException("Year out of range");
        }
        year++;
        if (!isLeapYear(year) && month == 2) {
            if (day == 29) day = 28;
        }
        return this;
    }

    public MyDate previousDay() {
        if (day == 1) {
            previousMonth();
        }
        else if (day == 1 && month == 3 && !isLeapYear(year)) {
            day = 28;
            previousMonth();
        }
        else if (day == 1 && month == 3 && isLeapYear(year)) {
            day =  29;
            previousMonth();
        }
        else {
            day--;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            year--;
        }
        if (day == 31 && (month == 5 || month == 7 || month == 10 || month == 12)) {
            day--;
            month--;
        }
        else if (day == 31 && month == 3 && isLeapYear(year)) day = 29;
        else if (day == 31 && month == 3 && !isLeapYear(year)) day = 28;
        else if (day == 1 && month == 1) {
            day = 31;
            month = 12;
        }
        else {
            month--;
        }
        return this;
    }

    public MyDate previousYear() {
        if (year == 1) {
            throw new IllegalStateException("Year out of range");
        }
        year--;
        if (!isLeapYear(year) && month == 2) {
            if (day == 29) day = 28;
        }
        return this;
    }

}
