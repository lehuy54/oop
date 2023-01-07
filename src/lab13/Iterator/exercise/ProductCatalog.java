package lab13.Iterator.exercise;

public class ProductCatalog implements Iterable{
    private String[] productCatalog;
    private int length;
    private final int SIZE = 100;

    public ProductCatalog() {
        this.length = 0;
        productCatalog = new String[this.SIZE];
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(this.productCatalog, this.length);
    }

    public ProductCatalog add(String product) {
        if (length >= this.productCatalog.length - 1) {
            return this;
        }
        this.productCatalog[this.length++] = product;
//        this.length++;
        return this;
    }
}
