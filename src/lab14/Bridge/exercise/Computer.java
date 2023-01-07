package lab14.Bridge.exercise;

public abstract class Computer {

    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }
    public abstract void startUp();
    public abstract void browseInternet(String url);
    public abstract boolean canMove();
}
