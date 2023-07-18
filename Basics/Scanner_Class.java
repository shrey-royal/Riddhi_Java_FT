import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("Enter a string: ");
        String str = scan.next();   // next() reads a string until a space is found

        System.out.println("Enter a float: ");
        float flt = scan.nextFloat();

        System.out.println("Enter a double: ");
        double dbl = scan.nextDouble();

        System.out.println("Enter a boolean: ");
        boolean bool = scan.nextBoolean();  // true or false

        System.out.println("Enter a long: ");
        long lng = scan.nextLong();

        System.out.println("Enter a short: ");
        short shrt = scan.nextShort();

        System.out.println("Enter a byte: ");
        byte byt = scan.nextByte();


        System.out.println("Enter a string: ");
        scan.nextLine();  // This is needed to clear the buffer
        String str2 = scan.nextLine();  // nextLine() reads a string until a new line is found

        scan.close();

        System.out.println("Number: " + num);
        System.out.println("String: " + str);
        System.out.println("Float: " + flt);
        System.out.println("Double: " + dbl);
        System.out.println("Boolean: " + bool);
        System.out.println("Long: " + lng);
        System.out.println("Short: " + shrt);
        System.out.println("Byte: " + byt);
        System.out.println("String: " + str2);

    }
}

/*
Scanner class is used to get user input, and it is found in the java.util package.

> To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. 

Methods: 

1. nextBoolean() - Reads a boolean value from the user
2. nextByte() - Reads a byte value from the user
3. nextDouble() - Reads a double value from the user
4. nextFloat() - Reads a float value from the user
5. nextInt() - Reads a int value from the user
6. nextLine() - Reads a String value from the user
7. nextLong() - Reads a long value from the user
8. nextShort() - Reads a short value from the user
9. close() - Closes the scanner
*/