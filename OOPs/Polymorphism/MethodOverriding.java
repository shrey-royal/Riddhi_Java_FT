class Vehicle {
    public void drive() {
        System.out.println("Driving vehicle");
    }

    public void drive(int speed) {
        System.out.println("Driving vehicle at " + speed + " kmph");
    }
}


class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    @Override
    public void drive(int speed) {
        System.out.println("Driving a car at " + speed + " kmph");
    }
}

class Bike extends Vehicle {
    @Override
    public void drive() {
        // super.drive();
        System.out.println("Driving a bike");
    }

    @Override
    public void drive(int speed) {
        // super.drive(speed);
        System.out.println("Driving a bike at " + speed + " kmph");
    }
}

class OverridingThings {
    void sum(int a, long b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        vehicle.drive(100);

        Car car = new Car();
        car.drive();
        car.drive(120);

        Bike bike = new Bike();
        bike.drive();
        bike.drive(50);

        OverridingThings overridingThings = new OverridingThings();
        overridingThings.sum(10, 20);//now second int literal will be promoted to long
        overridingThings.sum(10, 20, 30);
    }
}
