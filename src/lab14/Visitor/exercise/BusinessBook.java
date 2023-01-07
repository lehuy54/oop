package lab14.Visitor.exercise;

public class BusinessBook extends Book{
    private String publisher;

    public BusinessBook(double price, String publisher) {
        super(price);
        this.publisher = publisher;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
