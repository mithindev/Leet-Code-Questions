package APRIL.DAY16;

import java.util.Arrays;
import java.util.Stack;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));

        duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));

    }

//    static void duplicateZeros(int[] arr) {
//
//        int len = arr.length;
//
//        int[] ans = Arrays.copyOfRange(arr, 0, len);
//
//        int j = 0;
//        for (int i = 0; i < len; i++) {
//            if (j < len ) {
//                arr[j] = ans[i];
//                i++;
//                j++;
//            }
//
//            if (ans[i] == 0 && j < len) {
//                arr[j] = 0;
//                j++;
//            }
//        }
//    }

    static void duplicateZeros(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];
        int j = 0;
        for (int i = 0; i < len && j < len; i++) {
            ans[i] = arr[j];
            if (arr[j] == 0 && i < len - 1) {
                ans[++i] = 0;
            }
            j++;
        }
        System.arraycopy(ans, 0, arr, 0, len);
    }
}
