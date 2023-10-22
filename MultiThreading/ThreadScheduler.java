import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadScheduler {
    public static void main(String[] args) {
        //create a ScheduledExecutorService with a single thread
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        //Schedule a task to run every 2 seconds
        Runnable task = new Runnable() {
            int count = 0;
            @Override
            public void run() {
                //task
                count++;
                System.out.print("Task is executed at: " + System.currentTimeMillis());
                System.out.println(",\tTask is executed " + count + " times");
            }
        };

        //Schedule the task to run every 2 seconds with an initial delay of 0 seconds
        scheduler.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);

        //Keep the program running for a while to observe the scheduled tasks
        try {
            Thread.sleep(10000);    //Sleep for 10 seconds
        } catch (Exception e) {
            System.out.println(e);
        }

        //Shutdown the scheduler
        scheduler.shutdown();
    }
}

/*

Thread Scheduling: 

it is a component that decides which thread should run.

A component of java that decides which thread should run or execute and which thread should wait is called Thread Scheduler.

If there is only one thread then the thread scheduler is not required. But, if there are multiple threads then the thread scheduler will have to schedule threads.

There are some criteria to schedule threads:
    1. Priority of the thread
    2. Time of arrival

1. Priority: Priority of each thread lies between 1 to 10. if a thread is having priority 10 then it is the highest priority thread and if a thread is having priority 1 then it is the lowest priority thread. By default, every thread will have priority 5. If a thread has a higher priority, it means that thread has got a better chance of getting picked up by the thread scheduler. But, it is not guaranteed that the thread with the highest priority will always get picked up by the thread scheduler. It depends on the thread scheduler.

2. Time of Arrival: Suppose two threads of the same priority enter the runnable state, then priority cannot be the factor to pick a thread from these two threads. In such a case, arrival time of thread is considered by the thread scheduler. A thread that arrived first gets the preference over the other threads.

Thread Scheduler Algorithms:
    1. First Come First Serve
    2. Time-Slicing Scheduling
    3. Preemptive-Priority Scheduling


*/