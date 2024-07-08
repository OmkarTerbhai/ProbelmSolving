package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Leetcode :- 66
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] + 1 <= 9) {
                digits[i]++;
                return digits;
            }
            else
                digits[i] = 0;
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

        return arr;
    }
}
