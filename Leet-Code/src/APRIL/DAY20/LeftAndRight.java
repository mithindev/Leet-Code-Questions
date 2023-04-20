package APRIL.DAY20;

public class LeftAndRight {
    public static void main(String[] args) {

    }

    static int[] leftRigthDifference(int[] arr) {
        int[] left = leftSum(arr);
        int[] right = rightSum(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(left[i] - right[i]);
        }
        return arr;
    }

    static int[] leftSum (int[] arr) {
        int len = arr.length;
        int sum = 0;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            ans[i] = sum;
            sum+= arr[i];
        }
        return ans;
    }

    static int[] rightSum(int[] arr) {
        int len = arr.length;
        int sum = 0;
        int[] ans = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            ans[i] = sum;
            sum+= arr[i];
        }
        return ans;
    }
}
