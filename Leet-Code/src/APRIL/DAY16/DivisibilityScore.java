package APRIL.DAY16;

public class DivisibilityScore {
    public static void main(String[] args) {
        int[] nums = {73,13,20,6};
        int[] divisors = {56,75,83,26,24,53,56,61};

        System.out.println(maxDivScore(nums, divisors));
    }

//    static int maxDivScore(int[] nums, int[] divisors) {
//        int ans = divisors[0];
//        int temp = 0;
//
//        for (int div : divisors) {
//            int count = 0;
//            for (int num : nums) {
//                if (num % div == 0) {
//                    count++;
//                }
//            }
//            if (count > temp) {
//                temp = count;
//                ans = div;
//            }
//        }
//        return ans;
//    }

    static int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = Integer.MIN_VALUE;
        int maxDiv = Integer.MAX_VALUE;

        for (int i = 0; i < divisors.length; i++) {
            int score = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0) {
                    score++;
                }
            }
            if (score > maxScore) {
                maxScore = score;
                maxDiv = divisors[i];
            } else if (score == maxScore) {
                maxDiv = Math.min(maxDiv, divisors[i]);
            }
        }
        return maxDiv;
    }
}
