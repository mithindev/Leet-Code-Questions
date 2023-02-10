package FEBRUARY.DAY10;

public class ClimbingStairs {
    public static void main(String[] args) {
        int ans = climbStairs(3);
        System.out.println(ans);
    }

    static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }

        int a = 3;
        int b = 2;

        for (int i = 0; i < n-3; i++) {
            int temp = a;
            a = a + b;
            b = temp;
        }
        return a;
    }
}
