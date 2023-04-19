//package APRIL.DAY18;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1, 1, 2, 3, 4, 5, 6, 6, 6, 7, 7, 8};
//
//        System.out.println(findMaxConsecutiveOnes(arr));
//    }
//
//    static int findMaxConsecutiveOnes(int[] arr) {
//        int ans = 0;
//
//        for (int i = 0; i < arr.length;) {
//            int temp = 0;
//            while (i < arr.length && arr[i] == arr[i+1]) {
//                temp++;
//                i++;
//            }
//
//            if (temp > ans) {
//                ans = temp;
//            }
//            i++;
//        }
//
//        return ans;
//    }
//}
