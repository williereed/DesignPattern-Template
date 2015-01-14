package MyBase;

public class PackageB extends Trip {
    public void doComingTransport() {
        System.out.println(" ");
        System.out.println("Travel PackageB travel to destination by train ...");
    }
    public void doDay1() {
        System.out.println("Travel PackageB day1 visits the mountains ...");
    }
    public void doDay2() {
        System.out.println("Travel PackageB day2 visits the beach ...");
    }
    public void doDay3() {
        System.out.println("Travel PackageB day3 visits the zoo ...");
    }
    public void doReturningTransport() {
        System.out.println("Travel PackageB travel home by bus ...");
    }
}