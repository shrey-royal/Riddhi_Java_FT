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


*/