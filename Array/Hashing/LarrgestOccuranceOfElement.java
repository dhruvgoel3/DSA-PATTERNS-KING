package Hashing;

import java.util.HashMap;

public class LarrgestOccuranceOfElement {
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7, 3, 6, 1, 1, 1, 5, 7, 3, 5, 3, 6};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int el : arr) {
            if (!map.containsKey(el)) {
                map.put(el, 1);
            } else {
                map.put(el, map.get(el) + 1);
            }
        }

        int maxFreq = 0;
        int ansKey = -1;

        for (var e : map.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(ansKey + " -> " + maxFreq);

    }
}
