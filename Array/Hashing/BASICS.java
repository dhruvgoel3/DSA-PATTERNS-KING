package Hashing;

import java.util.HashMap;
import java.util.Map;

public class BASICS {
    static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 1, 5, 3, 6, 3, 6, 8, 7, 20};
        Map<Integer, Integer> map = new HashMap<>();


        //----------------Here is the process to add the elements of a array in a hashmap-------------

        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        //---------------------- Traversing and printing the keys as well as values
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

               // Keys
        for (int key : map.keySet()) {
            System.out.println(key);
        }

                // Values
        for (int value : map.values()) {
            System.out.println(value);
        }

        System.out.println(map.get(1)); // it will return that how many times 1 is occurred
        System.out.println(map.values()); // it will return all the values in our hashmap
        System.out.println(map.keySet()); // it will return all the keys in our hashmap
        System.out.println(map.entrySet()); // returns - keys = values -> [1=2, 2=2, 3=2, 5=2, 6=2]
        System.out.println(map.get("20"));                     // Returns 1
        System.out.println(map.containsValue(20));             // true
        System.out.println(map.isEmpty());                     // false
        System.out.println(map.isEmpty());                     // Number of keys

        System.out.println(map.getOrDefault(2, 6));

    }
}
