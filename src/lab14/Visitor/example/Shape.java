package lab14.Visitor.example;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor v);
}
