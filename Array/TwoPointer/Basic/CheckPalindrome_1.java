package TwoPointer.Basic;

// Check the array is palindrome or not
public class CheckPalindrome_1 {
    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (arr[start] == arr[end]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1};
        System.out.println(isPalindrome(arr));


    }
}
