package StringsByBabbar;

public class MaximumNestingDepth {
    public static int countDepth(String s) {
        int ans = 0;
        int current = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                current++;
                ans = Math.max(ans, current);
            } else if (ch == ')') {
                current--;
            }


        }
        return ans;
    }

    static void main() {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(countDepth(s));


    }
}
