package JULY.DAY3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] code = {2,4,9,3};

        int[] ans = decrypt(code, -2);

        System.out.println(Arrays.toString(ans));
    }

    static int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            ans[i] = helperSum(code, i, k, len);
        }

        return ans;
    }

    static int helperSum (int[] arr, int start, int k, int len) {
        int ans = 0;
        int s = start;

        if (k == 0) {
            return ans;
        }

        if (k > 0) {
            for (int i = 0; i < k; i++) {
                ans += arr[(s + i + 1) % len];
            }
        }

        if(k < 0) {
            k = Math.abs(k);
            int index = s - 1;

            for (int i = 1; i <= k; i++) {
                if (index== -1) {
                    index = len - 1;
                }
                ans += arr[(index)];
                index--;
            }
        }

        return ans;
    }
}
