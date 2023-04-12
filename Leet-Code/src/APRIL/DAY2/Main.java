package APRIL.DAY2;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5, 0};
        duplicateZeros(arr);
    }

    static void duplicateZeros(int[] arr) {
        int[] ans = Arrays.copyOf(arr, arr.length);
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            arr[j] = ans[i];
            i++;
            j++;
            if (i < ans.length && ans[i] == 0) {
                arr[j] = 0;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
