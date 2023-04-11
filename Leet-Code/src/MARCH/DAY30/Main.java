package MARCH.DAY30;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7,5,6,8,3};
        System.out.println(findGCD(arr));
    }

    static int findGCD(int[] arr) {
        Arrays.sort(arr);
        int ans = 1;
        for (int i = arr[0]; i >= 1; i--) {
            if (arr[0] %i == 0 && arr[arr.length - 1] % i == 0) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
