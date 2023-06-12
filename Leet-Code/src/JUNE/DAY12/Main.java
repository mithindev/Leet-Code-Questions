package JUNE.DAY12;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] ans = createTargetArray(nums, index);
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            insert(ans, nums[i], index[i]);
        }
        return ans;
    }

    static void insert (int[] arr, int target, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = target;
    }
}
