package FEBRUARY.DAY15;

import java.lang.Math;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] arr) {
        int ans = 0;

        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minVal = Math.min(arr[i], minVal);

            if (minVal != arr[i]) {
                ans = Math.max(ans, arr[i] - minVal);
            }
        }
        return ans;
    }
}
