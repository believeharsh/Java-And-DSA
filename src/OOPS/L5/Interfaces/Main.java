package OOPS.L5.Interfaces;

public class Main {
    public static void main(String[] args) {
        
        // Car Maruti = new Car() ; 
        // Maruti.acc();
        // Maruti.brake();
        // Maruti.start();
        // Maruti.stop();

        // Media CarMedia = new Car();
        // CarMedia.stop();
        // CarMedia.Start();


        NiceCar car = new NiceCar() ; 
        car.start();
        car.StartMusic();
        car.upgradeEngine();
        car.start();
        
    }
}
