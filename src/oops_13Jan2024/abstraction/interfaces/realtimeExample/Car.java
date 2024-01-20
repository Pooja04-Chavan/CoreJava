package src.oops_13Jan2024.abstraction.interfaces.realtimeExample;

public class Car implements Engine,Break {
    void start(){
        System.out.println("Starting the Car");
        startEngine();
        breaks();
    }

    @Override
    public void startEngine() {
        System.out.println("Started Enginer");
    }

    @Override
    public void breaks() {
        System.out.println("break is working fine");
    }
}
