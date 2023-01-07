package lab14.Visitor.exercise;

public abstract class ProgramingBook extends Book{

    public ProgramingBook(double price) {
        super(price);
    }
    @Override
    public void accept(Visitor visitor) {

    }

    public abstract String getResource();
}
