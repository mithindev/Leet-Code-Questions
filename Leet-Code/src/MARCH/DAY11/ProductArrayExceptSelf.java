package MARCH.DAY11;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    static int[] productExceptSelf(int[] arr) {

        int left = 1;
        int right = 1;
        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            ans[i] = left;
            left *= arr[i];
        }

        for(int i = arr.length -1; i > -1; i--) {
            ans[i] = right*ans[i];  // left * right
            right *= arr[i];
        }
        return ans;
    }
}
