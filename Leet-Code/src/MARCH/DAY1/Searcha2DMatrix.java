package MARCH.DAY1;

import java.sql.SQLOutput;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(searchMatrix(matrix, 5));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (BinarySearch(matrix[i], target)) {
                return true;
            }
        }
        return false;
    }

    static boolean BinarySearch (int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s)/2;

            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}
