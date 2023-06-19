class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int sum = 0;

        for (int i : gain) {
            sum += i;
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;       
    }
}