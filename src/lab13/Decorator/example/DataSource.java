package lab13.Decorator.example;

public interface DataSource {
    void writeData(String data);

    String readData();
}