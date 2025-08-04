class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car is being driven");
    }
}
class ElectricCar extends Car{
    void charge(){
        System.out.println("Electric car is charging");
    }
}

public class VehicleCar{
    public static void main(String[] args){
        ElectricCar E = new ElectricCar();
        E.start();
        E.drive();
        E.charge();
    }
}

/*
Vehicle is starting
Car is being driven
Electric car is charging
*/