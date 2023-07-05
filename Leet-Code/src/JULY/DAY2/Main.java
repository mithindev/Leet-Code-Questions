package JULY.DAY2;

public class Main {
    public static void main(String[] args) {
        int[] time = {1, 2, 3};

        System.out.println(minimumTime(time, 5));

    }

    static long minimumTime(int[] time, int totalTrips) {
        int l = time.length;

        long s = 1;
        long e = Long.MAX_VALUE;

        while (s <= e) {
            long mid = s + (e - s) / 2;

            long temp = noOfTrips(mid, time, l);

            if (temp >= totalTrips) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return s;
    }

    static long noOfTrips(long limit, int[] time, int l) {
        long[] trips = new long[l];

        for (int i = 0; i < l; i++) {
            trips[i] = limit / time[i];
        }

        return sum(trips);
    }

    static long sum(long[] arr) {
        long ans = 0;
        for (long i : arr) {
            ans += i;
        }
        return ans;
    }
}
