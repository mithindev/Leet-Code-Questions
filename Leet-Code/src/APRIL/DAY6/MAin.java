package APRIL.DAY6;

import java.util.Arrays;

public class MAin {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumbersThanCurrent1(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j == i) {
                    continue;
                } else if (arr[j] < arr[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    static int[] smallerNumbersThanCurrent(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

        }

        return ans;
    }
}
