package FEBRUARY.DAY12;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat = {
                {0, 1},
                {1, 0}
        };

        int[][] target = {
                {1, 0},
                {0, 1}
        };

        for (int i = 0; i <= 3; i++) {
            if (check(mat, target)) {
                System.out.println(true);
            } else {
                rotate(mat);
            }
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

    static boolean check (int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }

        }
        return true;
    }
}
