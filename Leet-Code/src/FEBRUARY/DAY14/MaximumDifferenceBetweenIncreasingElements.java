package FEBRUARY.DAY14;

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 4};
        System.out.println(maximumDifference(arr));


    }

    static int maximumDifference(int[] arr) {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[j] - arr[i];
                if (temp > ans && arr[i] < arr[j]) {
                    ans = temp;
                }
            }
//            Integer.
        }
        return ans;
    }
}
