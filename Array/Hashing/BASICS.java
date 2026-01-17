package Hashing;

import java.util.HashMap;
import java.util.Map;

public class BASICS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 1, 5, 3, 6, 3, 6};
        Map<Integer, Integer> map = new HashMap<>();
        // Here is the process to add the elements of a array in a hashmap
        for (int el : arr) {
            if (!map.containsKey(el)) {
                map.put(el, 1);
            } else {
                map.put(el, map.get(el) + 1);
            }
        }
        System.out.println(map.get(1)); // it will return that how many times 1 is occurred
        System.out.println(map.values()); // it will return all the values in our hashmap
        System.out.println(map.keySet()); // it will return all the keys in our hashmap
        System.out.println(map.entrySet()); // returns - keys = values -> [1=2, 2=2, 3=2, 5=2, 6=2]

    }
}
