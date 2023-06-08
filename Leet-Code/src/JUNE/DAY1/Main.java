package JUNE.DAY1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];

        int i = 1;

        while (i < arr.length) {
            if (arr[i] - arr[i - 1] != d) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }
}
