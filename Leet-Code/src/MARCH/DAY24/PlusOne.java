package MARCH.DAY24;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    static int ArrToNum (int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i] * Math.pow(10, arr.length - i - 1);
        }
        return ans;
    }

    static int[] NumToArr (int num) {
        int temp = num;
        int[] ans = new int[((int)Math.log10(num) + 1)];

        for (int i = 0; i < ans.length; i++) {
            ans[ans.length - 1 - i] = temp%10;
            temp /= 10;
        }
        return ans;
    }
}
