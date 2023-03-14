package MARCH.DAY12;

import java.lang.Math;

/*
171. Excel Sheet Column Number
Name : Mithin Dev A
Date: 13-03-2023
 */

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }

    static int titleToNumber(String str) {
        int ans = 0;
        int n = str.length() - 1;
        for (int i = n; i >= 0; i--) {
            ans += Math.pow(26, i) * (str.charAt(n - i) % 64);
        }
        return ans;
    }
}
