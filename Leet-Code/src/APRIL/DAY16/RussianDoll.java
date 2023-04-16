package APRIL.DAY16;

import java.util.Arrays;

public class RussianDoll {
    public static void main(String[] args) {
        int[][] mat = {
                {5,4},
                {6,4},
                {6,7},
                {2,3}
        };

        sort(mat);

        for (int[] i : mat) {
            System.out.println(Arrays.toString(i));
        }
    }

//    static int maxEnvelopes(int[][] envelopes) {
//
//    }

    static void sort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[j][0] > matrix[j - 1][0] && matrix[j][1] > matrix[j - 1][1]) {
                    int[] temp = matrix[j];
                    matrix[j] = matrix[j - 1];
                    matrix[j - 1] = temp;
                }
            }
        }
    }
}
