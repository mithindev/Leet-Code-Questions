package JANUARY.DAY3;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int target = 6;
        int[] ans = twoSum (arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] twoSum (int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j){
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
