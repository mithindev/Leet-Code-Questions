package MARCH.DAY23;
/*
Qn: 215. Kth Largest Element in an Array
Link: https://leetcode.com/problems/kth-largest-element-in-an-array/
 */

import java.util.Arrays;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr, 4));
    }

    static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void sortArrays(int[] arr) {

        int length = arr.length;

        for (int j = 0; j < length - 1; j++) {

            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                j = -1;
            }
        }
    }
}
