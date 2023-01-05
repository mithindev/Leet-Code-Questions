package JANUARY.DAY5;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 2, 2, 1};
        int val = 2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = nums[i+1];
            }
        }
        System.out.println(Arrays.toString(nums));

    }

}
