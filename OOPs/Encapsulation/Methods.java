class Car {
    private int speed;
    private int gear;
    private enum carType {SPORTS, SEDAN, SUV};

    // Getter methods: used to read the value of a private field
    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public carType getCarType(int i) {
        return carType.values()[i-1];
    }

    // Setter methods: used to set the value of a private field
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}


public class Methods extends Car {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(100);
        c.setGear(5);

        System.out.println("Speed: " + c.getSpeed());
        System.out.println("Gear: " + c.getGear());
        System.out.println("Car type: " + c.getCarType(2));
    }
}
