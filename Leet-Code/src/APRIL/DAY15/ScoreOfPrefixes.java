package APRIL.DAY15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ScoreOfPrefixes {
    public static void main(String[] args) {
        int[] arr ={2,3,7,5,10};
        long[] ans = findPrefixScore(arr);

        System.out.println(Arrays.toString(ans));

    }

    static long[] findPrefixScore(int[] nums) {
        int len = nums.length;
        long[] ans = new long[len];

        ans[0] = 2 * nums[0];

        for (int i = 1; i < len; i++) {
            ans[i] = sum(conv(nums, i));
        }
        return ans;
    }

    static long sum (long[] arr) {
        long ans = 0;

        for (long i : arr) {
            ans += i;
        }

        return ans;
    }

    static long[] conv (int[] arr, int i) {
        long[] ans = new long[i + 1];

        for (int j = 0; j < i + 1; j++) {
            ans[j] = arr[j] + Arrays.stream(Arrays.copyOfRange(arr, 0, j+1)).max().getAsInt();
        }

        return ans;
    }
}
