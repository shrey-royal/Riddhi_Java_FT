import java.util.ArrayList;
import java.util.Iterator;

public class ArreList {
    // ArrayList/Vector/LinkedList/Stack implements List interface extends Collection interface extends Iterable interface
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Ram");
        list.add("Krishna");
        list.add("Shiva");
                
        // System.out.println(list);        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Ganesh");
        list2.add("Hanuman");
        list2.add("Bramha");
        list.addAll(list2);

        System.out.println(list);


        //get
        // System.out.println(list.get(4));

        //set
        // list.set(0, "Ramchandra");
        // System.out.println(list);

        //remove
        // list.remove(0);
        // System.out.println(list);

        //removeAll
        // list.removeAll(list2);
        // System.out.println(list);

        //clear
        // list.clear();
        // System.out.println(list);

        //size
        // System.out.println(list.size());

        //contains
        // System.out.println(list.contains("Ram"));

        //toArray
        // Object[] arr = list.toArray();
        // for (Object object : arr) {
        //     System.out.println(object);
        // }

        //convert list to string array
        // String[] str = new String[list.size()];
        // list.toArray(str);
        // for (String string : str) {
        //     System.out.println(string);
        // }

        //iterator
        // Iterator<String> i = list.iterator();
        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }

        //for each
        // for (String string : list) {
        //     System.out.print(string + ", ");
        // }

    }
}

/*
Collections in java:
    > Collection is a framework that provides an architecture to store and manipulate the group of objects.

Methods of List
The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.

Some of the commonly used methods of the Collection interface that's also available in the List interface are:

add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element

*/