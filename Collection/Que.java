import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;

public class Que {
    public static void main(String[] args) {
        /*
        // PriorityQueue<String> queue = new PriorityQueue<>();

        // queue.add("Ram");
        // queue.add("Krishna");
        // queue.add("Shiva");
        // queue.add("Ganesh");
        // queue.add("Hanuman");
        // queue.add("Bramha");

        // System.out.println(queue);

        // System.out.println(queue.peek());
        // System.out.println(queue.poll());   //remove and return the element at the front of the queue
        // System.out.println(queue);

        // System.out.println(queue.size());
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.contains("Ram"));
        // System.out.println(queue.toArray()[3]);
        // queue.clear();
        // System.out.println(queue);
        */

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.offerFirst("Ram");
        deque.offerFirst("Krishna");
        deque.offerLast("Shiva");
        deque.offerLast("Ganesh");
        deque.offer("Hanuman");
        deque.offerFirst("Bramha"); 
        
        /*
        > offer returns true if the element is added successfully and false if the element is not added
        > add throws an exception if the element is not added
        */
        // System.out.println(deque);
        // System.out.println(deque.peek());
        // System.out.println(deque.poll());
        // System.out.println(deque);

        // System.out.println(deque.peekFirst());
        // System.out.println(deque.peekLast());

        // System.out.println(deque.pollFirst());
        // System.out.println(deque.pollLast());

        // System.out.println(deque);

        // System.out.println(deque.size());

        // System.out.println(deque.isEmpty());

        // System.out.println(deque.contains("Ram"));

        // System.out.println(deque.toArray()[3]);

        // System.out.println(deque.removeFirst());
        // System.out.println(deque.removeLast());

        // System.out.println(deque.removeFirstOccurrence("Ram"));
        // System.out.println(deque.removeLastOccurrence("Ganesh"));

        // Iterator<String> itr = deque.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        // Spliterator<String> sp = deque.spliterator();
        //forEachRemaining() method of Spliterator
        // sp.forEachRemaining(element -> System.out.print(element + ", "));

        //tryAdvance() method of Spliterator
        // while (sp.tryAdvance(n -> System.out.println(n))) {}

        //comparator() class
        Comparator<String> reverseComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // return -o1.compareTo(o2);   //reverse order
                return o2.compareTo(o1);   //reverse order
            }
        };

        deque.stream().sorted(reverseComparator).forEach(System.out::println);

    }
}
/*
Methods of Queue:
    1. add() - add element to the end of the Queue
    2. remove() - remove element from the front of the Queue
    3. peek() - return the element at the front of the Queue
    4. poll() - return the element at the front of the Queue and remove it
    5. size() - return the number of elements in the Queue
    6. isEmpty() - return true if the Queue is empty
    7. clear() - remove all elements from the Queue
    8. spliterator() - return a Spliterator over the elements in the Queue


Methods of Deque: (Double Ended Queue)
    1. addFirst() - add element to the front of the Deque
    2. addLast() - add element to the end of the Deque
    3. removeFirst() - remove element from the front of the Deque
    4. removeLast() - remove element from the end of the Deque
    5. peekFirst() - return the element at the front of the Deque
    6. peekLast() - return the element at the end of the Deque
    7. pollFirst() - return the element at the front of the Deque and remove it
    8. pollLast() - return the element at the end of the Deque and remove it
    9. size() - return the number of elements in the Deque
    10. isEmpty() - return true if the Deque is empty
    11. clear() - remove all elements from the Deque


*/