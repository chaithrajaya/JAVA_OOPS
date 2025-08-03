class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle{
    @Override
    void run(){
        System.out.println("Bike is running safely");
    }
}
public class VehicleBike{
    public static void main(String[] args){
        Vehicle v = new Bike();
        v.run();
    }
}

// Bike is running safely
