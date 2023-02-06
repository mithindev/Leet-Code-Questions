package FEBRUARY.DAY6;

import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int[] ans = shuffle(arr, 3);
        System.out.println(Arrays.toString(ans));


    }

    static int[] shuffle(int[] arr, int n) {
        int[] ans = new int[2*n];

        for (int i = 0,j = 0; i < 2*n; i+=2) {
            ans[i] = arr[j++];
        }
        for (int i = 1,j = n; i < 2*n; i+=2) {
            ans[i] = arr[j++];
        }
        return ans;
    }
}
