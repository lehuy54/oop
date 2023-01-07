package lab10.ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestApp {
    public static void main(String[] args) throws ParseException {
        Item i1 = new Book("Soffocare", 2002, 170);
        Item i2 = new Dvd("Moon", 2011, 130);

        Student s1 = new Student("0001", "Darrell", "Abbott", "011334144");
        Student s2 = new Student( "0002", "Nick", "Gerr",  7);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Rent[] rents = new Rent[2];
        rents[0] = new Rent(i1, s1, sdf.parse("01/01/2020"), sdf.parse("03/01/2020"));
        rents[1] = new Rent(i2, s2, sdf.parse("04/05/2021"), sdf.parse("05/05/2022"));

        Library lib = new Library(rents);
        System.out.println(lib.getLongestRent());

    }
}
