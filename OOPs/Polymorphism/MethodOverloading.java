class Vehicle {
    public void drive() {
        System.out.println("Driving vehicle");
    }

    public void drive(int speed) {
        System.out.println("Driving vehicle at " + speed + " kmph");
    }

    public void drive(String vehicle) {
        System.out.println("Driving a " + vehicle);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        vehicle.drive("car");
        vehicle.drive(100);
    }
}
