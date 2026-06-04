package ArraysByBabbar.Lecture_4;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static int firstRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (int i : arr) {
            if (map.get(i) > 1) {
                return i;
            }

        }
        return -1;


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 3, 5, 1, 3, 6};
        System.out.println(firstRepeatingElement(arr));

    }

}
