package JUNE.DAY20;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7,4,3,9,1,8,5,2,6};

        int i = 3;
        int ans = helper (arr, i - 3, i + 3);
        System.out.println(ans);
    }

    static int helper (int[] arr, int s, int e) {
        int avg = 0;

        if (s < 0 || e >= arr.length) {
            return -1;
        }

        for (int i = s; i <= e; i++) {
            avg += arr[i];
        }
        return avg / ((e - s) + 1);
    }
}
