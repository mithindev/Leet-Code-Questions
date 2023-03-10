package FEBRUARY.DAY12;

import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1},
                {1, 0}
        };


        for (int i = 0; i < 4; i++) {
            rotate(matrix);
            for (int[] j : matrix) {
                System.out.println(Arrays.toString(j));
            }
            System.out.println("_________________________");

        }

    }

    static void rotate (int[][] matrix) {


        for (int i = 0; i < matrix.length/2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[matrix.length-1-i];
            matrix[matrix.length-1-i] = temp;
        }

        for (int r = 1; r < matrix.length; r++) {
            for (int c = 0; c <= r; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }


    }

}
