package day3;

import java.util.Scanner;

public class TruncateSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        System.out.print(truncateSentence(str, k));
    }

    public static String truncateSentence(String s, int k) {
        if(s == null || s.length() == 1)
            return s;

        String[] strArr = s.split("\\s+");
        String sAns = "";

        for(int i = 0; i < k; i++) {
            sAns += strArr[i] + " ";
        }

        return sAns.trim();
    }
}
