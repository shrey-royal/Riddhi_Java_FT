import java.nio.charset.StandardCharsets;

public class Type_Casting {
    public static void main(String[] args) {
        // Implicit Type Casting    (Widening Casting)
        // int myInt = 9;
        // double myDouble = myInt; // Automatic casting: int to double

        // System.out.println(myInt);      // Outputs 9
        // System.out.println(myDouble);   // Outputs 9.0

        // Explicit Type Casting    (Narrowing Casting)
        // double myDouble2 = 9.78;
        // int myInt2 = (int) myDouble2; // Manual casting: double to int

        // System.out.println(myDouble2);   // Outputs 9.78
        // System.out.println(myInt2);      // Outputs 9

        // Type Casting
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte

        //Using Wrapper Classes
        // String str = "123"; //Object of String class
        // int num = Integer.parseInt(str);
        // System.out.println(num); //123

        // String str2 = "123.33";
        // double num2 = Double.parseDouble(str2);
        // System.out.println(num2); //123.33
        // float num3 = Float.parseFloat(str2);
        // System.out.println(num3); //123.33

        // String str3 = "true";
        // boolean bool = Boolean.parseBoolean(str3);
        // System.out.println(bool); //true

        // String str4 = "a";
        // char ch = str4.charAt(0);
        // System.out.println(ch); //a

        byte[] B = "a".getBytes(StandardCharsets.US_ASCII);
        System.out.println(B[0]); //97

        int a = (int) "c".charAt(0);
        System.out.println(a); //67
        
    }
}
/* 
In Java, there are two types of casting:
    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double
    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte

We use Wrapper classes to convert primitive data types into objects (object typecasting).
    byte -> Byte
    short -> Short
    int -> Integer
    long -> Long
    float -> Float
    double -> Double
    boolean -> Boolean
    char -> Character

Advantages of type casting:
    1. Code Optimization: Casting can improve the readability of the code without affecting the performance.
    2. Code Reusability: Casting can be used to reuse the code.
    3. Code Modularity: Casting can be used to make the code more modular.
*/