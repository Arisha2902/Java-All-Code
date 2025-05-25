//method overridding in Java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    // @Override
    void start() {
        System.out.println("Car is starting");
    }
}

class methodoverridding{
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.start(); 

        Car myCar = new Car();
        myCar.start(); 
    }
}