package lab12.Observer.excercise;

public class HexaObserver extends Observer {
    private String hexa;

    public HexaObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }
    @Override
    public void update() {
        this.hexa = convertDecimalToHexa(this.subject.getState());
    }

    private String convertDecimalToHexa(int decimal) {
        return Integer.toHexString(decimal);
    }

    @Override
    public String toString() {
        return "Hex number: " + hexa;
    }
}
