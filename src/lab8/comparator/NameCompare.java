package lab8.comparator;
import java.util.Comparator;

public class NameCompare implements Comparator<Movie2> {
    public int compare(Movie2 left, Movie2 right){
        return left.getName().compareTo(right.getName());
    }
}