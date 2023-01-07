package lab8.comparator;
import java.util.Comparator;

public class RatingCompare implements Comparator<Movie2> {
    public int compare(Movie2 left, Movie2 right){
        return Double.compare(left.getRating(), right.getRating());
    }
}
