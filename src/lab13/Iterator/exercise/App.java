package lab13.Iterator.exercise;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add("Apple")
                .add("Banana")
                .add("Orange")
                .add("Coconut")
                .add("Grape");

        Iterator it = productCatalog.getIterator();
        while (it.hasNext()) {
            String product = (String) it.next();
            System.out.println(product);
        }
    }
}
