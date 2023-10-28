import java.util.HashMap;

public class HasMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ram");
        map.put(2, "Krishna");
        map.put(3, "Shiva");
        map.put(4, "Ganesh");
        map.put(5, "Bramha");
        map.put(6, "Parshuram");
        map.put(7, "Vishnu");
        map.put(8, "Kalki");
        map.put(9, "Narayan");
        map.put(10, "Kuber");
        map.put(11, "Indra");
        map.put(12, "Surya");
        map.put(13, "Chandra");
        map.put(14, "Yam");
        map.put(15, "Varun");
        map.put(16, "Vayu");
        map.put(17, "Agni");
        map.put(18, "Kamdev");
        map.put(19, "Narad");
        map.put(20, "Hanuman");

        System.out.println(map);
        // System.out.println("Size: " + map.size());
        // System.out.println("Value of key 1: " + map.get(1));
        // System.out.println(map.isEmpty());
        // System.out.println(map.containsKey(111));
        // System.out.println(map.containsValue("Ram"));

        //replace
        // map.replace(1, "Ram", "Ramchandra");
        // System.out.println(map);

        //remove
        // map.remove(1);
        // System.out.println(map);

        //clear
        // map.clear();
        // System.out.println(map);

        //keySet
        // System.out.println(map.keySet());

        //values
        // System.out.println(map.values());

        //entrySet
        // System.out.println(map.entrySet());

        //putAll
        // HashMap<Integer, String> map2 = new HashMap<>();
        // map2.put(21, "Car");
        // map2.put(22, "Bike");
        // map2.put(23, "Bus");
        // map.putAll(map2);
        // System.out.println(map);

        //getOrDefault: if key is not present, return default value
        // System.out.println(map.getOrDefault(111, "Not Found"));

        //putIfAbsent: prevents overwriting
        map.putIfAbsent(111, "Rama");
        System.out.println(map);



    }
}
/*
Methods of HashMap: (key(unique), value(anything))

1. put(key, value): This method is used to insert an entry in this map.
2. get(key): This method is used to return the value for the specified key.
3. remove(key): This method is used to delete an entry for the specified key.
4. containsKey(key): This method is used to search the specified key from this map.
5. containsValue(value): This method is used to search the specified value from this map.
6. size(): This method is used to return the size of this map.
7. replace(key, oldValue, newValue): This method is used to replace the oldValue with newValue for the specified key.
8. replace(key, value): This method is used to replace the value for the specified key.
9. putAll(Map m): This method is used to copy all of the mappings from the specified map to this map.
10. clear(): This method is used to remove all of the mappings from this map.
11. keySet(): This method is used to return the Set view containing all the keys.
12. values(): This method is used to return the collection view containing all the values.
13. entrySet(): This method is used to return the Set view containing all the keys and values.
14. getOrDefault(Object key, V defaultValue): This method is used to return the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
15. putIfAbsent(K key, V value): This method inserts the specified value with the specified key in the map only if it is not already specified.



*/