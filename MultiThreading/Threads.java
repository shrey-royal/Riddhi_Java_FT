import java.util.Set;

class CustomThread implements Runnable {

    public void run() {
        try {
            Thread.sleep(2000); //wait for 2 seconds
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++) {
            Thread t = new Thread(new CustomThread());

            t.setName("Thread-" + i);  //Thread-0, Thread-1, Thread-2, Thread-3, Thread-4

            t.start();
            t.run();
        }

        Set<Thread> tset = Thread.getAllStackTraces().keySet();

        for (Thread t : tset) {
            System.out.println("Thread :"  + t + ", Thread Status :" + t.getState());
        }
    }
}

/*
This method returns an enum State that has the following values:

NEW: The thread has not yet started execution.
RUNNABLE: A thread in execution.
BLOCKED: A thread in a blocked state.
WAITING: A thread in a waiting state.
TIMED_WAITING: A state for a waiting thread with a specified waiting time.
TERMINATED: The thread is terminated.



*/