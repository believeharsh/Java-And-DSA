package OOPS.L5.Interfaces;

public class CDMedia implements Media {
    @Override
    public void start() {
        System.out.println("Cd Player is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Cd player is Stopping");
    }
}
