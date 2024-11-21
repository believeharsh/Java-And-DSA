package OOPS.L5.Interfaces;

public class PowerEngine  implements Engine{

    @Override
    public void start() {
       System.out.println("Now Power Engine is Starting");
    }

    @Override
    public void stop() {
       System.out.println("Now Power Engine is Stopping");
    }
    
    @Override
    public void acc() {
       System.out.println("Now Power Engine is accelerating");
    }
    
    
}
