package day2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leetcode:- 3190 - Minimum Operations to make all elements divisible by 3
 * https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/
 */
public class MinOperationsToDivBy3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(minimumOperations(arr));
    }
    public static int minimumOperations(int[] nums) {
        int iSum = 0;
        for(int i : nums) {
            int iNo = getClosestDivBy3(i);
            iSum += (Math.abs(i - iNo));
        }

        return iSum;
    }

    private static int getClosestDivBy3(int iNo) {
        int n1 = iNo-1;
        int n2 = iNo;
        int n3 = iNo+1;

        if(n1 == 0) return 0;

        if(n1 % 3 == 0) return n1;
        if(n2 % 3 == 0) return n2;
        if(n3 % 3 == 0) return n3;
        else
            return 0;
    }
}
