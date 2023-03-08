package MARCH.DAY9;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(10, -3));
    }

    static int divide(int dividend, int divisor) {
        int ans = 0;

        while (dividend >= 0) {
            ans++;
            if (divisor < 0) {
                dividend += divisor;
            } else {
                dividend -= divisor;
            }
        }
        if (divisor < 0) {
            return -1*(ans-1);
        } else {
            return ans-1;
        }

    }
}
