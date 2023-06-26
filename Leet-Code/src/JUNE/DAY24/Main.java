package JUNE.DAY24;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    static int maximumGap(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }

        Arrays.sort(arr);
        int ans = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i] - arr[i - 1];

            if (temp > ans) {
                ans = temp;
            }
        }
        return ans;
    }
}
