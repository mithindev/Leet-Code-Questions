package MARCH.DAY9;

import java.lang.String;

public class LargestOddNumberString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }

    static String largestOddNumber(String num) {
        char[] str = num.toCharArray();
        int i = num.length() - 1;

        while (i >= 0) {
            if ((int)(str[i])%2 == 0) {
                i--;
            } else {
                return charToString (str, 0, i);
            }
        }
        return "";
    }

    static String charToString (char[] str, int s, int e) {
        StringBuilder ans = new StringBuilder();

        for (int i = s;i <= e; i++) {
            ans.append(str[i]);
        }
        return ans.toString();
    }

}
