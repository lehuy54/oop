package lab5;

public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book2(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("oop.Book[name = ").append(this.name).append(", authors = {");
        for (int i = 0; i < authors.length; i++) {
            description.append(authors[i].toString());
            description.append((i == authors.length - 1) ? "" : ",");
        }
        description.append("}, price = ")
                .append(this.price)
                .append(", qty = ")
                .append(this.qty)
                .append("]");
        return description.toString();
    }

    public String getAuthorNames() {
        StringBuilder description = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
             description.append(authors[i].getName());
        }
        return description.toString();
    }

}