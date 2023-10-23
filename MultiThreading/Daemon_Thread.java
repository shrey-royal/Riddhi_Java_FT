
public class Daemon_Thread extends Thread {
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread is running");
        } else {
            System.out.println("User Thread is running");
        }
    }


    public static void main(String[] args) {
        Daemon_Thread t1 = new Daemon_Thread();
        Daemon_Thread t2 = new Daemon_Thread();
        Daemon_Thread t3 = new Daemon_Thread();

        
        // to set a thread as Daemon Thread
        t1.setDaemon(true);
        
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println(t1.isAlive() + " " + t2.isAlive() + " " + t3.isAlive());
        System.out.println(t1.isDaemon() + " " + t2.isDaemon() + " " + t3.isDaemon());
    
    }
}

/*
What is Daemon Thread?
Daemon thread is a low priority thread which runs intermittently in the background doing the garbage collection operation for the java runtime system. It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.

If there are no user threads running then the Daemon thread automatically ends.

*/