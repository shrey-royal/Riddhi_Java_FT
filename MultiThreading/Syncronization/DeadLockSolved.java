public class DeadLockSolved {
    public static void main(String[] args) {
        final String resource1 = "Kitkat";
        final String resource2 = "Ferrero Rocher";

        Thread t1 = new Thread("Riddhi") {
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + ": locked KitKat");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + ": locked Ferrero Rocher");
                    }
                }
            } 
        };

        Thread t2 = new Thread("Ruby") {
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + ": locked KitKat");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + ": locked Ferrero Rocher");
                    }
                }
            } 
        };

        t1.start();
        t2.start();
    }
}
