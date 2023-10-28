import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HasSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Ram");
        set.add("Krishna");
        set.add("Shiva");
        set.add("Ganesh");
        set.add("Hanuman");
        set.add("Bramha");

        System.out.println(set);

        // System.out.println(set.size());

        // System.out.println(set.isEmpty());

        // System.out.println(set.contains("Ram"));

        // System.out.println(set.toArray()[3]);

        // set.clear();

        // System.out.println(set);

        // Iterator<String> i = set.iterator();
        // while(i.hasNext()) {
        //     System.out.println(i.next());
        // }

        // Spliterator<String> s = set.spliterator();
        // s.forEachRemaining(System.out::println);

    }
}

/*
Methods of HashSet class:

1. add() - add element to the HashSet
2. clear() - remove all elements from the HashSet
3. clone() - return a shallow copy of the HashSet
4. contains() - return true if the HashSet contains the specified element
5. isEmpty() - return true if the HashSet is empty
6. remove() - remove the specified element from the HashSet
7. size() - return the number of elements in the HashSet
8. spliterator() - return a Spliterator over the elements in the HashSet


*/