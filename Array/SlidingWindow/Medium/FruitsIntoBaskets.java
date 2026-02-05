package SlidingWindow.Medium;

import java.util.HashMap;

public class FruitsIntoBaskets {
    public static int fruitsIntoBasket(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > 2) {
                map.put(arr[left], map.get(arr[left] - 1));

                if (map.get(arr[left] == 0)) {
                    map.remove(arr[left]);
                }
                left++;

            }
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2};
    }
}
