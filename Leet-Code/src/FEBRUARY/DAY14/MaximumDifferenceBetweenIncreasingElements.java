package FEBRUARY.DAY14;

import java.lang.Math;

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 4};
        System.out.println(maximumDifference(arr));


    }

    static int maximumDifference(int[] arr) {
        int ans = Integer.MIN_VALUE;

//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int temp = arr[j] - arr[i];
//                if (temp > ans && arr[i] < arr[j]) {
//                    ans = temp;
//                }
//            }
//        }
//        return ans;

        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minVal = Math.min(minVal, arr[i]);
                if (arr[i] != minVal) {
                    ans = Math.max(ans, arr[i] - minVal);
                }

        }
        return ans;
    }
}
