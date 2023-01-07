package lab14.Visitor.exercise;

public abstract class Book {
    protected double price;

    public Book(double price) {
        this.price = price;
    }

    public abstract void accept(Visitor visitor);

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
