package ArraysByBabbar.Lecture_2;

import java.util.HashMap;
import java.util.Map;

public class ModeOfAnArray {

    public static int modeOfArray(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int mode = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }

    public static void main(String[] args) {

        int[] arr = {
                1,1,1,1,
                3,3,3,3,3,3,3,3,3,3,3,3,3,
                4,4,4,4,4,
                6,6,6,6
        };

        System.out.println("Mode = " + modeOfArray(arr));
    }
}