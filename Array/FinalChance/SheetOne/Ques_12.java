package FinalChance.SheetOne;

import java.util.HashMap;
import java.util.Map;

public class Ques_12 {
    static void main() {
        int[] arr = {1, 2, 5, 3, 7, 3, 3, 2, 2, 8, 6, 8, 5, 8, 5, 0, 5, 8, 3};
        int[] sortedArray = {1, 2, 3, 4, 4, 4, 4, 5, 5, 7, 7, 7};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
// Remove duplicates - print elements which appears more than once