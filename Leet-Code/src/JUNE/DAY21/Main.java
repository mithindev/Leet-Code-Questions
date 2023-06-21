package JUNE.DAY21;

public class Main {
    public static void main(String[] args) {

    }

    static long minCost(int[] arr, int[] cost) {
        long x = weightedAvg(arr, cost);

        long ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans += Math.abs(arr[i] - x) * cost[i];
        }
        return ans;
    }

    static long weightedAvg (int[] arr, int[] cost) {
        int num = 0;
        int dino = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i] * cost[i];
            dino += cost[i];
        }

        return num/dino;
    }
}
