package lab14.Bridge.exercise;

public class Laptop extends Computer{

    public Laptop(OperatingSystem os) {
        super(os);
    }
    @Override
    public void startUp() {
        this.os.startUp();
    }

    @Override
    public void browseInternet(String url) {
        this.os.loadUrl(url);
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
