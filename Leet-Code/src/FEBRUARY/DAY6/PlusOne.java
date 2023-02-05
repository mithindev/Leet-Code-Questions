package FEBRUARY.DAY6;

import java.util.Arrays;
import java.lang.Math;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int num = arrayToInteger(arr);
        num++;
        System.out.println(Arrays.toString(numToArray(num)));

    }

    static int arrayToInteger (int[] arr) {
        int ans = 0;
        int n = arr.length-1;
        for (int i = 0; i <= n; i++) {
            ans += arr[i] * Math.pow(10, n-i);

        }
        return ans;
    }

    static int count (int num) {
        int cnt = 0;
        while (num > 0) {
            cnt++;
            num /=10;
        }
        return cnt;
    }

    static void reverse (int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    static int[] numToArray (int num) {
        int[] arr = new int[count(num)];

        for (int i = 0; i < arr.length; i++) {

        }
        return arr;
    }
}
