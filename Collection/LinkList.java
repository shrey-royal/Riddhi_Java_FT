import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Ram");
        ll.add("Krishna");
        ll.add("Shiva");
        ll.add("Ganesh");
        ll.add("Hanuman");
        ll.add("Bramha");

        System.out.println(ll);

        ll.remove();
        System.out.println(ll);

        Vector<String> v = new Vector<>();

        v.add("Ram");
        v.add("Krishna");
        v.add("Shiva");
        v.add("Ganesh");
        v.add("Hanuman");
        v.add("Bramha");

        System.out.println(v);

        Iterator<String> i = v.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        v.set(3, "Parvati");

        System.out.println(v);

    }
}
