package lab7;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    void greets() {
        System.out.println("Meow");
    }
}
