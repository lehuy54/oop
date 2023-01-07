package lab12.FactoryMethod.excercise;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        if (type.equals("Apple")) {
            return new Apple();
        } else if (type.equals("Banana")) {
            return new Banana();
        }
        return new Orange();
    }
}
