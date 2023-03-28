package MARCH.DAY28;

import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] arr = {1};
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] arr) {
        int[] ans = new int[2*arr.length];

        for(int i = 0; i < ans.length; i++) {
            ans[i] = arr[i % arr.length];
        }
        return ans;
    }
}
