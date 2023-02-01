package FEBRUARY.DAY1;

import java.util.Arrays;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(Arrays.toString(convert(matrix)));
        int[] arr = convert(matrix);
        int target = 3;

        int s = 0;
        int e = arr.length -1;

        while (s <= e) {
            int mid = s + (e - s)/2;
            if (arr[mid] == target) {
//                return true;
                System.out.println(true);
            }
            if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }





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
