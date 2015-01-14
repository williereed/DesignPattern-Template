package MyBase;

public abstract class Trip {
    public final void performTrip(){
        doComingTransport();
        doDay1();
        doDay2();
        doDay3();
        doReturningTransport();
    }
    public abstract void doComingTransport();
    public abstract void doDay1();
    public abstract void doDay2();
    public abstract void doDay3();
    public abstract void doReturningTransport();
}
