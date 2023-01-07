package lab12.FactoryMethod.example;

public class WebDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
