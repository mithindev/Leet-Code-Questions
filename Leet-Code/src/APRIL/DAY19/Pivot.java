package APRIL.DAY19;

import java.util.Arrays;

public class Pivot {
    public static void main(String[] args) {
        int[] arr = {2, 1, -1};
        System.out.println(pivotIndex(arr));

//        System.out.println(Arrays.toString(rightSum(arr)));
    }

    static int pivotIndex(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = sum(arr);

        for (int i = 0; i < len; i++) {
            right = right - arr[i];
            if (left == right) {
                return i;
            }
            left += arr[i];
        }
        return -1;
    }

    static int sum (int[] arr) {
        int ans = 0;

        for (int i : arr) {
            ans += i;
        }
        return ans;
    }
    
    static int[] leftSum (int[] arr) {
        int len = arr.length;
        int sum = 0;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            ans[i] = sum;
            sum+= arr[i];
        }
        return ans;
    }

    static int[] rightSum(int[] arr) {
        int len = arr.length;
        int sum = 0;
        int[] ans = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            ans[i] = sum;
            sum+= arr[i];
        }
        return ans;
    }
}
