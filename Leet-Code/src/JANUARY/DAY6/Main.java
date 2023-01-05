package JANUARY.DAY6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ans = rmElements(arr, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);


    }

    static int rmElements (int[] arr, int target) {

        int[] ans = arr;
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length;i++) {
            if (ans[i] != target) {
                temp[j++] = ans[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return j;


    }
}
