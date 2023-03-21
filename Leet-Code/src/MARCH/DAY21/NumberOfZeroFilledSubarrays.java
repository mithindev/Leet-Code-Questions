package MARCH.DAY21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfZeroFilledSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 0, 2, 0, 0, 4};
        System.out.println(zeroFilledSubarray(arr));

    }

    static long zeroFilledSubarray(int[] arr) {
        long ans = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                i++;
            }
            if (arr[i] == 0) {
                int count = 1;
                while (arr[i++] == 0) {
                    count++;
                }
                ans+= fact(count);
            }

        }
        return ans;
    }

    static int fact (int num) {
        return num * (num + 1)/2;
    }
}