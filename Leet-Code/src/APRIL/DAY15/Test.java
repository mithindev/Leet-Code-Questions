package APRIL.DAY15;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] grid = {
                {1},
                {22},
                {333}
        };

        System.out.println(Arrays.toString(findColumnWidth(grid)));

    }

    static int[] findColumnWidth(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[] ans = new int[col];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                int temp = 0;

                int num = grid[j][i];

                if (num == 0) {
                    temp = 1;
                } else if (num < 0) {
                    temp = (int) (Math.log10(-1 * num) + 1) + 1;
                } else {
                    temp = (int) (Math.log10(num) + 1);
                }
                if (temp > ans[i]) {
                    ans[i] = temp;
                }
            }
        }
        return ans;
    }
}
