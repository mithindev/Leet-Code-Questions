package AUGUST.DAY25;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,7,4,4,5};
        System.out.println(countFairPairs(arr, 3, 6));
    }

    static long countFairPairs(int[] arr, int lower, int upper) {
        Arrays.sort(arr);
        return fairLessThan(arr, upper) - fairLessThan(arr, lower);
    }

    static long fairLessThan (int[] arr, int target) {
        long count = 0;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            while (i < j && arr[i] + arr[j] > target) {
                j--;
            }
            count += j - i;

            i++;
        }
        return count;
    }
}
