public class Program1 {
    public static void main(String[] args) {
        //1st way
        // Thread t1 = new Thread();

        //2nd way
        // Thread t2 = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("Thread t2 is running");
        //     }
        // });

        //3rd way
        // Thread t3 = new Thread(() -> {
        //     System.out.println("Thread t3 is running");
        // });

        Thread t1 = new Thread(); //creating a thread with name and priority

        System.out.println(t1); // Thread[Thread-0,5,main] -> Thread[Thread-name, priority, Thread-group]

        t1.setPriority(9);  //setting the priority of the thread

        System.out.println(t1); // Thread[Thread-0,10,main]
    }
}

/*
3 ways to create a thread:

1. By extending Thread class
2. By implementing Runnable interface
3. By implementing Callable interface

Priority of a thread:   1 to 10
                        MIN_PRIORITY = 1    //this means that the thread will get the least priority

                        NORM_PRIORITY = 5   //this means that the thread will get the normal priority

                        MAX_PRIORITY = 10   //this means that the thread will get the highest priority

Methods of Thread class:

1. public void start() -> starts the execution of the thread
2. public void run() -> contains the code that is to be executed by the thread
3. public void setName(String name) -> sets the name of the thread
4. public String getName() -> returns the name of the thread
5. public void setPriority(int priority) -> sets the priority of the thread
6. public int getPriority() -> returns the priority of the thread
7. public static void sleep(long milliseconds) -> causes the currently executing thread to sleep for the specified number of milliseconds
8. public static Thread currentThread() -> returns the reference of currently executing thread
9. public String toString() -> returns the string representation of the thread
10. public void join() -> waits for a thread to die
11. public void join(long milliseconds) -> waits for a thread to die for the specified number of milliseconds
12. public void interrupt() -> interrupts a thread
13. public boolean isInterrupted() -> returns true if the thread has been interrupted
14. isAlive() -> returns true if the thread is alive
15. isDaemon() -> returns true if the thread is a daemon thread
16. public void setDaemon(boolean b) -> marks the thread as daemon or user thread
17. getState() -> returns the state of the thread




*/