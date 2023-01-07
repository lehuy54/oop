package lab10.ex4_PhoneBook;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    ArrayList<Student> phoneBook;



    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student student : phoneBook) {
            if (student.getLastname().equals(lastname))
                return student;
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student number: phoneBook) {
            if (number.getPhone().equals(phone))
                return number;
        }
        return null;
    }
    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
