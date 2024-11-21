package OOPS.L5.Interfaces;

public class NiceCar {
    private Engine engine;

    private Media Player = new CDMedia();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void StartMusic() {
        Player.start();
    }

    public void stopMusic() {
        Player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
     }

}
