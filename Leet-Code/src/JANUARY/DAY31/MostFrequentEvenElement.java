package JANUARY.DAY31;

import java.util.Arrays;


public class MostFrequentEvenElement {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 0, 0, 2, 4, 4, 1};
        Arrays.sort(arr);
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && count(arr, arr[i]) > ans) {
                ans = arr[i];
            }
        }
//        return ans;
        System.out.println(ans);
    }

    static int count (int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
