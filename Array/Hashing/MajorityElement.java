package Hashing;

import java.util.HashMap;

// The element which occurs more than n/1 times is called the majority element
// We will be using moore-voting alogo to solve this algo
public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        for (int el : arr) {
            if (count == 0) {
                candidate = el;
            }
            if (el == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 2, 1, 2, 1, 1, 1, 1};
        System.out.println("Majority element is :- " + majorityElement(arr));

    }
}
