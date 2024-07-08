package day1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leetcode 189:- Rotate Array
 * https://leetcode.com/problems/rotate-array/description/
 */
public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        rotateArray(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        if(nums.length <= 1) return;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i < j) {
            int sw = arr[i];
            arr[i] = arr[j];
            arr[j] = sw;
            i++;
            j--;
        }
    }
}
