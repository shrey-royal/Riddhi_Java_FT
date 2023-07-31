class Animal {
    private Animal() {
        System.out.println("Animal is created");
    }

    public Animal(int a) {
        System.out.println("Animal is created");
    }
}

public class Constructors {
    // Instance Variables / Fields
    public String name;
    public String city;

    //Methods
    // Default Constructor
    private Constructors() {
        name = "Rahul";
        city = "Delhi";
        System.out.println("Constructor called");
    }

    void printDetails() {
        System.out.println("Name is: " + name);
        System.out.println("City is: " + city);
    }

    public static void main(String[] args) {
        Constructors obj = new Constructors();
        
        System.out.println("Name is: " + obj.name);
        System.out.println("City is: " + obj.city);

        Animal a = new Animal(2);    
    }
}

/*
Constructors are used to initialize the object’s state. Like methods, a constructor also contains collection of statements(i.e. instructions) that are executed at time of Object creation. It is a special type of method which is used to initialize the object.

Rules for creating Java constructor
    1. Constructor name must be same as its class name
    2. A Constructor must have no explicit return type
    3. A Java constructor cannot be abstract, static, final, and synchronized
    4. Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor

2 types of constructors
    1. Default Constructor - If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code on your behalf. This constructor is known as default constructor. It is a no argument constructor which is automatically provided by compiler unless you define your own constructor.

    2. Parameterized Constructor - Constructor with arguments(or you can say parameters) is known as Parameterized constructor. The biggest advantage of parameterized constructor is that you can initialize instance variables at the time of object creation.

Tasks:

1. Online Shopping Cart:
You are developing an online shopping website, and you need to implement a "ShoppingCart" class. The default constructor of this class will initialize the cart with default values such as an empty list of items, total cost set to zero, and a default currency (e.g., USD). Create an object of the "ShoppingCart" class using the default constructor and display the initial details of the cart.

2. Employee Database:
You are building an application to manage employee data for a company. Implement an "Employee" class with data members like name, employee ID, designation, and salary. The default constructor will initialize the employee with default values like "Unknown" for name and designation, ID set to zero, and salary set to the minimum wage. Create an object using the default constructor to represent a new employee and display their details.

3. Temperature Sensor:
Imagine you are working on an Internet of Things (IoT) project involving temperature sensors. Create a "TemperatureSensor" class with data members to store the current temperature reading, sensor ID, and location. The default constructor initializes the sensor with a default temperature value, sets the ID as "Unknown," and location as "Unspecified." Create an object of the "TemperatureSensor" class using the default constructor and display its properties.

4. School Attendance Tracker:
You are developing a system to track student attendance in a school. Implement a "Student" class with data members for student name, roll number, class, and attendance status. The default constructor will set the attendance status to "Absent" by default. Create an object of the "Student" class using the default constructor to represent a new student and display their attendance status.

5. Car Rental System:
Design a "Car" class to represent cars available for rent in a car rental system. The class should have attributes like car brand, model, year, and rental status. The default constructor initializes the car with default values like "Unknown" for brand and model, year set to the current year, and rental status as "Available." Create an object of the "Car" class using the default constructor and display its details.
*/
