/*
3. GPS Navigation:
   - Scenario: A GPS navigation system is calculating the route between two points, but due to network issues, it cannot retrieve map data.
   - Exception: Handle a "NoMapDataException" when attempting to fetch map data.

*/

import java.util.Random;
import java.util.Scanner;

class NoMapDataException extends Exception {
    NoMapDataException(String s) {
        super(s);
    }
}

public class GPS_Navigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter source: ");
        final String source = sc.nextLine();
        System.out.println("Enter destination: ");
        final String destination = sc.nextLine();
        sc.close();

        try {
            fetchMapData(source, destination);
        } catch (NoMapDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fetchMapData(String source, String destination) throws NoMapDataException {
        //we will generate 0 and 1 randomly
        Random random = new Random();
        int randomInt = random.nextInt(2);

        if (randomInt == 0) {
            throw new NoMapDataException("No map data available due to network issues");
        } else {
            System.out.println("Map data: " + source + " to " + destination + " is " + random.nextInt(100) + " kms");
        }
    }
}
