package FEBRUARY.DAY1;

import java.util.Arrays;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(convert(matrix)));


    }

    static int[] convert (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] arr = new int[m*n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[k++] = matrix[i][j];
            }
        }
        return arr;
    }
}
