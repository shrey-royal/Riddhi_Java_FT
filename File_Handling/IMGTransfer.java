import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IMGTransfer {
    public static void main(String[] args) {
        //Image Transfer
        FileInputStream in = null;
        FileOutputStream out = null;
        int ctr = 0;

        try {
            in = new FileInputStream("input.jpg");
            out = new FileOutputStream("C:\\Users\\Shrey Kadia\\Desktop\\output.jpg");
            int _byte;

            while((_byte = in.read()) != -1) {
                out.write(_byte);
                ctr++;
            }
            //exceptions -> FileNotFound, IO
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException e) {
            System.out.println("I/O Error");
        } finally {
            try {
                if(in != null) {
                    in.close();
                }
                if(out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
            System.out.println("Bytes transferred: " + ctr);
            System.out.println("Copied " + ctr + " bytes");
        }
    }
}
