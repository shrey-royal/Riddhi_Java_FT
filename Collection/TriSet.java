import java.util.Comparator;
import java.util.TreeSet;

public class TriSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Ram");
        set.add("Krishna");
        set.add("Shiva");
        set.add("Ganesh");
        set.add("Hanuman");
        set.add("Bramha");

        System.out.println(set);

        //clone
        // @SuppressWarnings("unchecked")
        // TreeSet<String> cloneSet = (TreeSet<String>)set.clone();
        // System.out.println(cloneSet);
        // TreeSet<String> cloneSet = new TreeSet<>(set);
        // System.out.println(cloneSet);

        //first
        // System.out.println(set.first());
        // System.out.println(set.last());

        //headSet
        // System.out.println(set.headSet("Krishna"));

        //tailSet
        // System.out.println(set.tailSet("Hanuman"));

        //subSet
        // System.out.println(set.subSet("Ganesh", "Ram"));

        //larger
        System.out.println(set.higher("Ganesh"));

        //smaller
        System.out.println(set.lower("Ganesh"));

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2); //reverse order
            }
        };

        TreeSet<String> set2 = new TreeSet<>(comp);
        set2.addAll(set);
        System.out.println(set2);

    }
}

/*
Methods of TreeSet:

1. boolean add(Object o): This method adds the specified element to this set if it is not already present.
2. boolean addAll(Collection c): This method adds all of the elements in the specified collection to this set.
3. void clear(): This method removes all of the elements from this set.
4. Object clone(): This method returns a shallow copy of this TreeSet instance.
5. boolean contains(Object o): This method returns true if this set contains the specified element.
6. boolean isEmpty(): This method returns true if this set contains no elements.
7. Iterator iterator(): This method returns an iterator over the elements in this set in ascending order.
8. boolean remove(Object o): This method removes the specified element from this set if it is present.
9. int size(): This method returns the number of elements in this set.
10. Object[] toArray(): This method returns an array containing all of the elements in this set.
11. Comparator comparator(): This method returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements.
12. Object first(): This method returns the first (lowest) element currently in this set.
13. SortedSet headSet(Object toElement): This method returns a view of the portion of this set whose elements are strictly less than toElement.
14. Object last(): This method returns the last (highest) element currently in this set.
15. SortedSet subSet(Object fromElement, Object toElement): This method returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
16. SortedSet tailSet(Object fromElement): This method returns a view of the portion of this set whose elements are greater than or equal to fromElement.


*/