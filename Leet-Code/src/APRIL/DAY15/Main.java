package APRIL.DAY15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {1},
                {22},
                {333}
        };

        System.out.println(Arrays.toString(findColumnWidth(grid)));

        int[] arr = {15,7,12};
        System.out.println(reqNum(arr));
    }

    static int[] findColumnWidth(int[][] grid) {

        if (grid[0].length == 1) {
            int ans = 0;
            for (int[] i : grid) {
                int temp;
                if (i[0] == 0) {
                    temp = 1;
                } else {
                    temp = reqNum(i);
                }
                if (temp > ans) {
                    ans = temp;
                }
            }
            return new int[] {ans};
        }


        transpose(grid);

        int[] ans = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            ans[i] = reqNum(grid[i]);
        }

        return ans;
    }

    static int reqNum (int[] arr) {
        int num1 = Arrays.stream(arr).max().getAsInt();
        int ans1 = 0;
        int num2 = Arrays.stream(arr).min().getAsInt();
        int ans2 = 0;

        if (num1 == 0) {
            ans1 = 1;
        } else {
            ans1 = (int) (Math.log10(num1) + 1);
        }


        if (num2 < 0) {
            ans2 = (int) (Math.log10(-1 * num2) + 1) + 1;
        }

        return Math.max(ans1, ans2);
    }

    public static void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
