package MARCH.DAY9;

public class SmallestElementinaSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        System.out.println(kthSmallest(arr, 8));
    }

    static int kthSmallest(int[][] matrix, int k) {
        return matrix[k%matrix.length-1][k%matrix[0].length-1];
    }

//    static int BS (int[][] matrix, int r, int target) {
//        int s = 0;
//        int e = matrix[0].length;
//
//        while (s < e) {
//            int mid = s + (e - s)/2;
//
//            if
//        }
//    }
}
