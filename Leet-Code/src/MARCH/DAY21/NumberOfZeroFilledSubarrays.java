package MARCH.DAY21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfZeroFilledSubarrays {
    public static void main(String[] args) {
        int[] arr = {2, 10, 19};
        System.out.println(zeroFilledSubarray(arr));

    }

    static long zeroFilledSubarray(int[] arr) {
        long ans = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                i++;
            } else if (arr[i] == 0) {
                int count = 1;
                while (i < arr.length && arr[i++] == 0) {
                    count++;
                }
                ans+= operation(count - 1);
            }

        }
        return ans;
    }

    static long operation (int num) {

        return num * (num + 1)/2;
    }
}