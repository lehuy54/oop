package lab8.comparator;

class Movie2 implements Comparable<Movie2>{
    private String name;
    private double rating;
    private int year;

    public int compareTo(Movie2 m){
        if (getYear() > m.getYear()){
            return 1;
        } else if (getYear() < m.getYear()){
            return -1;
        }
        return 0;
    }
    public Movie2(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}
