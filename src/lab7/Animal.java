package lab7;

public abstract class Animal {
    protected String name;

    public Animal (String name) {
        this.name = name;
    }

    abstract void greets();
}
