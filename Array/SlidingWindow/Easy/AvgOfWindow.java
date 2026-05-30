package SlidingWindow.Easy;

import java.util.ArrayList;
import java.util.List;

public class AvgOfWindow {

    public static List<Double> avgOfWindows(int[] arr, int k) {

        List<Double> list = new ArrayList<>();

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        list.add((double) windowSum / k);

        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i];
            windowSum -= arr[i - k];

            list.add((double) windowSum / k);
        }

        return list;
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

        System.out.println(avgOfWindows(arr, k));
    }
}