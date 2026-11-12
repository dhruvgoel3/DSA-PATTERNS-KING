package FinalChance.SheetOne;

import java.util.HashMap;

public class Ques_11 {
    static void main() {
        int[] arr = {1, 2, 5, 3, 7, 3, 3, 2, 2, 8, 6, 8, 5, 8, 5, 0, 5, 8, 3};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map);

    }
}
// freq counting