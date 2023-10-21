
class CustomThread extends Thread {
    private int num;

    CustomThread(String name, int num) {
        super(name);
        this.num = num;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + num + " * " + i + " = " + num*i);
            try {
                Thread.sleep(500); //wait for 2 seconds
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Thread_1 {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("Thread-1", 3);
        CustomThread t2 = new CustomThread("Thread-2", 2);
        t1.start();
        try {
            t1.join(1500);  //start t2 after 1.5 seconds
        } catch (Exception e) {
            System.out.println(e);
        }
        
        t2.start();
    }
}
