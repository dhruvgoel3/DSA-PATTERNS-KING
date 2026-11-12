package FinalChance.SheetOne;

import java.util.HashMap;
import java.util.Map;

public class Ques_14 {
    static void main() {
        int[] arr = {4, 1, 2, 1, 2};
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
// single number