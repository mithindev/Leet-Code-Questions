package MARCH.DAY29;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }

    static int arrangeCoins1(int n) {
        int ans = 0;
        int i = 1;

        while (n >= i) {
            ans++;
            n -= i;
            i++;
        }
        return ans;
    }

    static int arrangeCoins(int n) {
        int s = 1;
        int e = n;

        while (s < e) {
            int mid = s + (e - s)/2;

            if (mid * (mid + 1)/2 == n) {
                return mid;
            }

            if (mid * (mid + 1)/2 < n) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return e;
    }
}
