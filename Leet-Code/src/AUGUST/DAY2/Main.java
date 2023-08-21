package AUGUST.DAY2;

public class Main {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int[] ans = new int[len];

        int i = 0;
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                ans[i++] = num;
                k++;
            }
        }

        for (int j = 0; j < k; j++) {
            nums[j] = ans[j];
        }

        return k;
    }
}
