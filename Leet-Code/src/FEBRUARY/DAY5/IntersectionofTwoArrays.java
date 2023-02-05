package FEBRUARY.DAY5;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {

    }

    static boolean search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

//    static int[] intersectionNum(int[] arr1, int[] arr2) {
//
//    }
}
