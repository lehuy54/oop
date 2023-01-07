package lab5;

public class Account {
    private String ID;
    private String name;
    private int balance;

    public Account(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    public Account(String ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }
    public int debit(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account account,int amount) {
        if(amount<=balance){
            balance-=amount;
            account.balance+=amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("oop.Account[id = ")
                .append(this.ID)
                .append(", name = ")
                .append(this.name)
                .append(", balance = ")
                .append(this.balance)
                .append("]");

        return description.toString();
    }
}
