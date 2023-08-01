public class Static_KW {

    static int a = 10; // Static Variable
    int b = 20; // Non-Static Variable

    static void display() { // Static Method
        System.out.println("Static Method");
    }

    void show() { // Non-Static Method
        System.out.println("Non-Static Method");
    }

    static { // Static Block
        System.out.println("Static Block");
    }

    Static_KW() { // Constructor
        System.out.println("Constructor");
    }


    public static void main(String[] args) {
        // Static Keyword
        // Static Keyword is used to create variables and methods that will use the same memory space.

        // Static Variable
        Static_KW obj = new Static_KW();
        System.out.println("Static Variable: " + Static_KW.a);
        System.out.println("Non-Static Variable: " + obj.b);

        // Static Method
        Static_KW.display();
        obj.show();

        // Static Block


    }
}

/*

    Static is used to allocate the memory only once in a class while at compile time.
 * Static Keyword: 
 * Static Keyword is used to create variables and methods that will use the same memory space.
 * 
 * Static Variable:
 * Static variables are also known as Class variables.
 * 
 * Static Method:
 * Static methods are also known as Class methods.
 * 
 * Static Block:
 * Static block is used to initialize the static variables.
 * 
 */

/*
1. Static Utility Class for Math Operations:
Problem Statement: Create a static utility class in Java that contains static methods for basic math operations such as addition, subtraction, multiplication, and division.

2. Static Factory Method for Creating Objects:
Problem Statement: Implement a static factory method in a class to create instances of different types of products without exposing the constructors.

3. Static Method for Date Formatting:
Problem Statement: Create a static method in a Java class to format a given date into a user-readable string representation.

4. Static Method for Generating Random Numbers:
Problem Statement: Implement a static method in Java to generate random integers within a given range.

1. Static Utility Class for Math Operations:


public class MathOperations {
    private MathOperations() {} // Private constructor to prevent instantiation

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}


2. Static Factory Method for Creating Objects:


public class Product {
    private String name;
    private double price;

    private Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Covariant return type
    public static Product createProduct(String name, double price) {
        return new Product(name, price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


3. Static Method for Date Formatting:


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils() {} // Private constructor to prevent instantiation

    public static String formatDate(Date date, String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }
}


4. Static Method for Generating Random Numbers:


import java.util.Random;

public class RandomUtils {
    private RandomUtils() {} // Private constructor to prevent instantiation

    public static int generateRandomInt(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range: min must be less than or equal to max.");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}


Now you can use these utility classes and their static methods in other parts of your Java application. For example:


public class Main {
    public static void main(String[] args) {
        // Math Operations
        int sum = MathOperations.add(5, 3);
        int difference = MathOperations.subtract(10, 4);
        int product = MathOperations.multiply(2, 6);
        double quotient = MathOperations.divide(10.0, 2.5);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Static Factory Method for Creating Objects
        Product product1 = Product.createProduct("Laptop", 1000);
        Product product2 = Product.createProduct("Mobile Phone", 500);
        System.out.println("Product 1: " + product1.getName() + ", Price: " + product1.getPrice());
        System.out.println("Product 2: " + product2.getName() + ", Price: " + product2.getPrice());

        // Static Method for Date Formatting
        Date currentDate = new Date();
        String formattedDate = DateUtils.formatDate(currentDate, "yyyy-MM-dd");
        System.out.println("Formatted Date: " + formattedDate);

        // Static Method for Generating Random Numbers
        int randomNumber = RandomUtils.generateRandomInt(1, 100);
        System.out.println("Random Number: " + randomNumber);
    }
}



*/