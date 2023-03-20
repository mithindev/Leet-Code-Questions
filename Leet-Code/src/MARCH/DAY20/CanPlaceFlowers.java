package MARCH.DAY20;

/*
605. Can Place Flowers
Link: https://leetcode.com/problems/can-place-flowers/
 */

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(canPlaceFlowers(arr, 1));
    }

    static boolean canPlaceFlowers(int[] arr, int n) {
        int count = 0;

        if (arr.length == 1 && arr[0] == 0) {
            count ++;
        }

        if (arr.length > 1 && arr[0] == 0 && arr[1] == 0) {
            arr[0] = 1;
            count++;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != 1 && arr[i - 1] == 0 && arr[i + 1] == 0) {
                arr[i] = 1;
                count++;
            }
        }

        if (arr.length > 1 && arr[arr.length - 1] == 0 && arr[arr.length - 2] == 0) {
            arr[arr.length - 1] = 1;
            count++;
        }

        if (count == n) {
            return true;
        } else {
            return false;
        }
    }
}
