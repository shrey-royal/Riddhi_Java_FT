import java.util.Scanner;

public class Scanner_Class_1 {
    public static void main(String[] args) {
        //Scanner obj = new Scanner(inputSource);
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();

        // System.out.println("you have entered: " + num);

        // System.out.println("Enter a string: ");
        // String str = sc.next(); //next method only scan the first word
        // sc.nextLine(); // this is used to clear the buffer
        // String str = sc.nextLine(); //nextLine method scan the whole line
        // System.out.println("you have entered: `" + str + "`");

        System.out.println("Enter String: ");
        String scanUntilDot = sc.nextLine();

        Scanner scan = new Scanner(scanUntilDot).useDelimiter("\\n");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close();
        sc.close(); // close the scanner object
        // int a = 56;
        // System.out.println(a);
        // System.gc(); // garbage collector
    }
}

/*
 * We can have multiple Input Sources for Scanner class: 
 * 1. System.in    -  Keyboard
 * 2. File         -  File
 * 3. String       -  String
 * 4. Socket       -  Network Sockets
 * 5. Process      -  Process I/O
 */
