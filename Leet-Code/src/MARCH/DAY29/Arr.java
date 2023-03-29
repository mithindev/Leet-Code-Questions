package MARCH.DAY29;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[][] matrix = construct2DArray(arr, 1, 1);
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }

    static int[][] construct2DArray(int[] arr, int m, int n) {
        if (m*n != arr.length) {
            return new int[0][];
        }

        int[][] matrix = new int[m][n];

        int temp = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                matrix[r][c] = arr[temp++];
            }
        }
        return matrix;
    }
}
