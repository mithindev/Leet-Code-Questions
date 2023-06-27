package JUNE.DAY27;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    static int maximumCandies(int[] candies, long k) {
        if (candies == null || candies.length == 0) {
            return 0;
        }

        int s = 0;
        int e = max (candies);

        return binarySearch (candies, k, s, e);

    }

    static int binarySearch (int[] arr, long k, int s, int e) {
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isPossible(arr, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    static boolean isPossible (int[] arr, long k, int ans) {
        if (ans == 0) {
            return true;
        }

        long count = 0;

        for (int num : arr) {
            count += num / ans;
            if (count >= k) {
                return true;
            }
        }
        return false;
    }
    static int max (int[] arr) {
        int ans = 0;

        for (int num : arr) {
            if (num > ans) {
                ans = num;
            }
        }

        return ans;
    }
}
