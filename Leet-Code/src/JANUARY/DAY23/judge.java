package JANUARY.DAY23;

import java.util.Arrays;

public class judge {
    public static void main(String[] args) {
        int[][] trust = {{1, 2}, {2, 3}};
        int n = 3;
        if (trust.length == n) {
//            return -1;
            System.out.println(-1);
        }
        int[] arr1 = new int[n];
        int[] arr2 = new int[n-1];
        for (int i = 1;i <=n;i++) {
            arr1[i-1] = i;
        }
        for (int i = 0;i < n-1;i++) {
            arr2[i] = trust[i][0];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println(arr1[i]);
            }
        }
        System.out.println(n);
//        for (int i = 0; i < n-1; i++) {
//            if (BinSearch(arr, trust[i][0]) == -1) {
////                return trust[i][1];
//                System.out.println(trust[i][0]);
//            }
//        }

    }

    static int BinSearch (int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e-s)/2;

            if (arr[mid] == target) {
                return 1;
            }

            if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
