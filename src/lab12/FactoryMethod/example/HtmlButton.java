package lab12.FactoryMethod.example;

public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("HTML representation of button");
    }

    @Override
    public void onClick() {
        System.out.println("Bind a web browser click event");
    }
}
