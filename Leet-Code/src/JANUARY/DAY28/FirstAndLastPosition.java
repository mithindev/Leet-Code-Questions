package JANUARY.DAY28;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 4, 5, 5, 5, 5, 6};
        int target = 5;
        int[] ans = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans[0] = i;
                while(i<nums.length && nums[i] == target){
                    ans[1] = i;
                    i++;

                }
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
