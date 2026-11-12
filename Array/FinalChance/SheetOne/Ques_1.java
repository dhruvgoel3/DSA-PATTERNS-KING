package FinalChance.SheetOne;

import java.util.Scanner;

public class Ques_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : - ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter all the elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println(sum);


    }
}
// Basic Syntax covered