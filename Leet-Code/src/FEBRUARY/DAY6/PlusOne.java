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

    static int reverse (int num) {
        int ans = 0;
        int len = count(num)-1;
        int i = 0;
        while (num > 0) {
            int temp = num%10;
            ans += temp * Math.pow(10,len-i);
            i++;
            num = num/10;
        }
        return ans;
    }

    static int[] numToArray (int num) {
        int n = reverse(num);
        int[] arr = new int[count(num)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n%10;
            n = n/10;
        }
        return arr;
    }
}
