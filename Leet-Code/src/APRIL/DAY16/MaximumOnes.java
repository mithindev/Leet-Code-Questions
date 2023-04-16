package APRIL.DAY16;

import java.util.Arrays;

public class MaximumOnes {
    public static void main(String[] args) {
        int[][] mat = {
                {0,0,0},
                {0,1,1}
        };

        System.out.println(Arrays.toString(rowAndMaximumOnes(mat)));
    }

    static int[] rowAndMaximumOnes(int[][] mat) {
        int index = 0;
        int ans = 0;

        for (int i = 0; i < mat.length; i++) {
            int temp = sum(mat[i]);
            if (temp > ans) {
                ans = temp;
                index = i;
            }
        }
        return new int[] {index, ans};
    }

    static int sum (int[] arr) {
        int ans = 0;

        for (int i : arr) {
            ans+= i;
        }
        return ans;
    }

}
