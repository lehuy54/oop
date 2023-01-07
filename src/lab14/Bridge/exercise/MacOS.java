package lab14.Bridge.exercise;

public class MacOS implements OperatingSystem{
    @Override
    public void startUp() {
        System.out.println("MacOS starting up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("MacOS loading url!");
    }
}
