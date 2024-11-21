package OOPS.L5.Interfaces;

public class ElectricEngine implements Engine {

 

    @Override
    public void start() {
       System.out.println("New Electric Engine is Starting");
    }

    @Override
    public void stop() {
        System.out.println("New Electric Engine is Stopping");
    }

    @Override
    public void acc() {
        System.out.println("New Electric Engine is Acceleartings");
    } 
    
}
