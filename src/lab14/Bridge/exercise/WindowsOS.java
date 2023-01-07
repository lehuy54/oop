package lab14.Bridge.exercise;

public class WindowsOS implements OperatingSystem{
    @Override
    public void startUp() {
        System.out.println("WindowsOS starting up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("WindowsOS loading url");
    }
}
