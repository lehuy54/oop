package lab5;

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.customer.getID();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        amount = (double)this.amount * (((double)100-(double)this.customer.getDiscount())/(double)100);
        return amount;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("oop.Invoice[id = ")
                .append(this.ID)
                .append(", customer = ")
                .append(this.customer)
                .append(", amount = ")
                .append(this.amount)
                .append("]");

        return description.toString();
    }
}
