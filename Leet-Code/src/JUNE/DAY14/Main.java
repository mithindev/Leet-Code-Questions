package JUNE.DAY14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {3,2,1},
                {1,7,6},
                {2,7,7}
        };

        int ans = equalPairs(grid);
        System.out.println(ans);
    }

//    static int equalPairs(int[][] grid) {
//        int count = 0;
//        int len = grid.length;
//
//        for (int col = 0; col < len; col++) {
//
//            int[] column = new int[len];
//
//            for (int i = 0; i < len; i++) {
//                column[i] = grid[i][col];
//            }
//
//            for (int row = 0; row < len; row++) {
//
//                if (isPresent(column, grid[row])) {
//                    count++;
//                }
//            }
//
//        }
//
//        return count;
//    }

    static int equalPairs(int[][] grid) {
        int count = 0;
        int len = grid.length;

        for (int col = 0; col < len; col++) {
            int[] column = new int[len];

            for (int i = 0; i < len; i++) {
                column[i] = grid[i][col];
            }

            for (int row = 0; row < len; row++) {
                if (isSimilar(column, grid[row])) {
                    count++;
                }
            }
        }

        return count;
    }


    static boolean isSimilar(int[] col, int[] row) {
        return Arrays.equals(col, row);
    }


}
