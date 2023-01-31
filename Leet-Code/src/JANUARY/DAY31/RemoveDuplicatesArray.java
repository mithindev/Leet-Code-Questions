package JANUARY.DAY31;

import java.util.Arrays;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 3};
        int len = rmDup(arr1);
        System.out.println(len);
        int[] arr2 = new int[len];
        for (int i = 0; i < len; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

    }

    static int rmDup (int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[arr.length];

        int j = 0;

        for (int i = 0;i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                ans[j++] = arr[i];
            }
        }

        ans[j++] = arr[arr.length-1];

        for (int i = 0; i <= j; i++) {
            arr[i] = ans[i];
        }

        return j;
    }
}
