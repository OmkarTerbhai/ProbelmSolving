package day1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(getMaxConsOnes(arr));

    }

    public static int getMaxConsOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int iMax = 0;
        for(int i : nums) {
            if(i == 1) {
                maxConsecutiveOnes++;
            }
            else {
                iMax = Math.max(iMax, maxConsecutiveOnes);
                maxConsecutiveOnes = 0;
            }
        }

        return Math.max(iMax, maxConsecutiveOnes);
    }
}
