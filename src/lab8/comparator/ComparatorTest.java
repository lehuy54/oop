package lab8.comparator;
import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Movie2> list = new ArrayList<>();
        list.add(new Movie2("Force Awakens", 8.3, 2015));
        list.add(new Movie2("Star Wars", 8.7, 1977));
        list.add(new Movie2("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie2("Return of Jedi", 8.4, 1983));
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie2 movie : list) {
            System.out.println(movie.getRating() + " " +
                    movie.getName() + " " +
                    movie.getYear());
        }
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie2 movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie2 movie : list) {
            System.out.println(movie.getYear() + " " +
                    movie.getRating() + " " +
                    movie.getName());
        }
    }
}
