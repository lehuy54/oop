package lab10.ex4_PhoneBook;

public interface PhoneBook {
    void addPerson(Student p);
    Student searchByName(String name);
    Student searchByLastname(String lastname);
    Student searchByNumber(String phone);
    void deleteByNumber(String phone);
}
