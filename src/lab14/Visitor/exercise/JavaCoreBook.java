package lab14.Visitor.exercise;

public class JavaCoreBook extends ProgramingBook{
    private String resource;
    private String favouriteBook;

    public JavaCoreBook(double price, String resource, String favouriteBook) {
        super(price);
        this.resource = resource;
        this.favouriteBook = favouriteBook;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }

    public void setFavouriteBook(String favouriteBook) {
        this.favouriteBook = favouriteBook;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String getResource() {
        return this.resource;
    }
}
