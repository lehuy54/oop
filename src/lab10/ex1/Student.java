package lab10.ex1;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String id;
    String name;
    String lastname;
    String phone;
    double average;

    public Student(String id, String name, String lastname, String phone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String id, String name, String lastname, double average) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.average = average;
    }

    public Student(String id, String name, String lastname, String phone, double average) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int compareTo(Student s) {
        return this.getName().compareTo(s.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Double.compare(student.average, average) == 0
                && Objects.equals(id, student.id)
                && Objects.equals(name, student.name)
                && Objects.equals(lastname, student.lastname)
                && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname, phone, average);
    }
    @Override
    public String toString() {
        return "Student[id = " + id + '\'' + ", name= " + name + '\'' + ", lastname= " + lastname + '\''
                + ", phone= " + phone + '\'' + ", average= " + average + ']';
    }

}
