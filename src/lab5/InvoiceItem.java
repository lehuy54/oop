package lab5;

public class InvoiceItem {
    private String ID;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.ID = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getID() {
        return ID;
    }

    public void setId(String ID) {
        this.ID = ID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        double total = this.unitPrice * this.qty;
        return total;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("oop.InvoiceItem[id = ")
                .append(this.ID)
                .append(", desc = ")
                .append(this.desc)
                .append(", qty = ")
                .append(this.qty)
                .append(", unitPrice = ")
                .append(this.unitPrice)
                .append("]");

        return description.toString();
    }
}
