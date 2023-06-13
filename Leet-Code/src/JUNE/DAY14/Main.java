package JUNE.DAY14;

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

    static int equalPairs(int[][] grid) {
        int count = 0;
        for (int c = 0; c < grid.length; c++) {
            for (int r = 0; r < grid.length; r++) {
                if (!isPresent(grid[c], grid[c][r])) {
                    return count;
                }
            }
            count++;
        }
        return count;
    }

    static boolean isPresent (int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
}
