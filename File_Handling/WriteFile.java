import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        try {
            // writeFile();
            appendFile();
            // readFile();
            // deleteFile();
            getLength();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() throws IOException {
        FileWriter file = new FileWriter("file.txt");
        
        //write to the file
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text to write to the file: ");
        String str = sc.nextLine();
        str = str.toLowerCase().replaceAll("is", "");
        str = str.toLowerCase().replaceAll("and", "");
        str = str.toLowerCase().replaceAll("the", "");
        file.write(str);

        //close the file
        file.close();
    }

    public static void readFile() throws IOException {
        FileReader file = new FileReader("file.txt");
        int i;
        while((i = file.read()) != -1) {
            System.out.print((char) i);
        }
        file.close();
    }

    public static void appendFile() throws IOException {
        FileWriter file = new FileWriter("file.txt", true);
        file.write("This is the appended text");
        file.close();
    }

    public static void deleteFile() throws IOException {
        // 1st way
        // FileWriter file = new FileWriter("file.txt");
        // file.write("");
        // file.close();

        //2nd way
        Path p = Paths.get("file.txt");
        Files.delete(p);
        System.out.println("File deleted successfully");
    }

    public static void getLength() throws IOException {
        // Path p = Paths.get("file.txt");
        // System.out.println("File size: " + p.toFile().length());

        FileReader file = new FileReader("file.txt");
        int i;
        int count = 0;
        while((i = file.read()) != -1) {
            count++;
        }
        System.out.println("File size: " + count + " bytes");
    }

}
