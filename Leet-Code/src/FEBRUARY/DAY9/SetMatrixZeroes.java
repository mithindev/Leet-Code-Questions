package FEBRUARY.DAY9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(matrix);

        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j );
            }
            System.out.println("");
        }

    }

    static void setZeroes(int[][] matrix) {
        List<List<Integer>> ind =  indices (matrix);

        for (List<Integer> each : ind) {
            int row = each.get(0);
            int col = each.get(1);
            RCzero(matrix, row, col);
        }

    }

    static List<List<Integer>> indices (int[][] matrix) {
        List<List<Integer>> outer = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(i);
                    inner.add(j);
                    outer.add(inner);
                }

            }
        }
        return outer;
    }

    static void RCzero (int[][] matrix, int r, int c) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[r][i] = 0;
            matrix[i][c] = 0;
        }
    }
}
