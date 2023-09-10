abstract class Car {

    abstract void engine();

    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

class Audi extends Car {
    @Override
    void engine() {
        System.out.println("Audi engine");
    }
}

class BMW extends Car {
    @Override
    void engine() {
        System.out.println("BMW engine");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Audi a = new Audi();
        a.start();
        a.engine();
        a.stop();
        System.out.println();

        BMW b = new BMW();
        b.start();
        b.engine();
        b.stop();
    }
}
/*
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

We can Achieve Abstraction in two ways:
    1. Abstract class (0 to 100%)
    2. Interface (100%)

Abstract class
    A class which is declared with the abstract keyword is known as an abstract class in Java.
    It can have abstract and non-abstract methods (method with the body).
    It needs to be extended and its method implemented. It cannot be instantiated.
*/