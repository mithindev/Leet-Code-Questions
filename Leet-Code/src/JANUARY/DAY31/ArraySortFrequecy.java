package JANUARY.DAY31;

import java.util.Arrays;

public class ArraySortFrequecy {
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 4, 4};
        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }


        int len = rmDup(arr1);
//        System.out.println(len);
        int[] arr2 = new int[len];
        for (int i = 0; i < len; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        sortFreq(arr3, arr2);
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

    static int count (int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    static void sortFreq (int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 1; j < arr2.length; j++) {
                if (count (arr1,arr2[j]) > count (arr1, arr2[j-1])) {
                    // swap
                    int temp = arr2[j-1];
                    arr2[j-1] = arr2[j];
                    arr2[j] = temp;
                }
            }

        }
    }
}
