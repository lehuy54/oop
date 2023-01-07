package lab5;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        salary = salary/percent + salary;
        return salary;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("oop.InvoiceItem[")
                .append("id = ")
                .append(this.id)
                .append(", name = ")
                .append(this.firstName)
                .append(" ")
                .append(this.lastName)
                .append(", salary = ")
                .append(this.salary);

        return description.toString();
    }

}
