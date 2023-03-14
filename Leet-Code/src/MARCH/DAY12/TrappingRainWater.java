package MARCH.DAY12;

/*
42. Trapping Rain Water
Name : Mithin Dev A
Date: 13-03-2023
 */

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(arr));

    }

    static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int l_max = 0, r_max = 0;

        int ans = 0;
        while (left < right) {
            l_max = Math.max(l_max, height[left]);
            r_max = Math.max(r_max, height[right]);

            if (l_max < r_max) {
                ans += l_max - height[left];
                left++;
            } else {
                ans += r_max - height[right];
                right--;
            }
        }
        return ans;
    }
}
