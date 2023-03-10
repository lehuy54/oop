package lab5;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("oop.Author[name = ")
                .append(this.name)
                .append(", email = ")
                .append(this.email)
                .append(", gender = ")
                .append(this.gender)
                .append("]");

        return description.toString();
    }
}
