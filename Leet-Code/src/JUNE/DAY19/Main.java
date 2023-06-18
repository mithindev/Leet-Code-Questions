package JUNE.DAY19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {100,1,10};
        System.out.println(findValueOfPartition(arr));
    }

    static int findValueOfPartition(int[] arr) {

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = beggar(arr, i);
            if (temp < ans) {
                ans = temp;
            }
        }
        return ans;
    }

    static int beggar (int[] arr, int index) {
        int len = arr.length;
        int[] arr1;
        int[] arr2;

        int ans = Integer.MAX_VALUE;

        if (index == arr.length) {
            arr1 = Arrays.copyOfRange(arr, 0, arr.length);
            arr2 = Arrays.copyOfRange(arr,  len- 1, len);
        }

        arr1 = Arrays.copyOfRange(arr, 0, index + 1);
        arr2 = Arrays.copyOfRange(arr,index + 1, len);

        return Math.abs(max(arr1) - min(arr2));
    }

    static int max (int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > ans) {
                ans = i;
            }
        }
        return ans;
    }

    static int min (int[] arr) {
        int ans = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < ans) {
                ans = i;
            }
        }
        return ans;
    }
}
