package MARCH.DAY1;

import java.sql.SQLOutput;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(BinarySearch(arr, 2));
    }

//    static boolean searchMatrix(int[][] matrix, int target) {
//
//    }

    static boolean BinarySearch (int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
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
