package lab5;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width)*2;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("oop.Rectangle")
                .append("[")
                .append("length = ")
                .append(this.length)
                .append(", width = ")
                .append(this.width)
                .append("]");

        return description.toString();
    }
}
