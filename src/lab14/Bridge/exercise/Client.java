package lab14.Bridge.exercise;

public class Client {
    public static void main(String[] args) {
        OperatingSystem windows = new WindowsOS();
        OperatingSystem mac = new MacOS();

        Computer laptop1 = new Laptop(windows);
        laptop1.startUp();


        Computer laptop2 = new Laptop(mac);

        Computer pc1 = new PC(mac);
        Computer pc2 = new PC(windows);
    }
}
