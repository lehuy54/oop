package lab14.Bridge.exercise;

public class PC extends Computer{

    public PC(OperatingSystem os) {
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
        return false;
    }
}
