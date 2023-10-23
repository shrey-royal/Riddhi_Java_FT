public class DeadLock {
    public static void main(String[] args) {
        final String resource1 = "Kitkat";
        final String resource2 = "Ferrero Rocher";

        Thread t1 = new Thread("Riddhi") {
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + ": locked " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + ": locked " + resource2);
                    }
                }
            } 
        };

        Thread t2 = new Thread("Ruby") {
            public void run() {
                synchronized(resource2) {
                    System.out.println(Thread.currentThread().getName() + ": locked " + resource2);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    synchronized(resource1) {
                        System.out.println(Thread.currentThread().getName() + ": locked " + resource1);
                    }
                }
            } 
        };

        t1.start();
        t2.start();
    }
}

/*
DeadLock is a situation where two or more threads are blocked forever, waiting for each other.

for ex:
    > You are waiting for your friend to come out of his home and your friend is waiting for you to go to his home.


> deadlock may also include more than two threads. The reason is that it can be difficult to detect a deadlock. Here is an example in which four threads have deadlocked:

Thread 1 locks A, waits for B

Thread 2 locks B, waits for C

Thread 3 locks C, waits for D

Thread 4 locks D, waits for A

Thread 1 waits for thread 2, thread 2 waits for thread 3, thread 3 waits for thread 4, and thread 4 waits for thread 1.

How to avoid deadlock?
A solution for a problem is found at its roots. In deadlock it is the pattern of accessing the resources A and B, is the main issue. To solve the issue we will have to simply re-order the statements where the code is accessing shared resources.

*/