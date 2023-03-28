package MARCH.DAY27;

import java.util.Arrays;
import java.lang.Math;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] ans = sortedSquares(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] sortedSquares(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (Math.abs(arr[j]) < Math.abs(arr[j - 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            arr[arr.length - i - 1] *= arr[arr.length - 1 - i];
        }
        return arr;
    }


}
