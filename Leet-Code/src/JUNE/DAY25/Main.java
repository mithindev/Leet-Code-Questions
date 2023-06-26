package JUNE.DAY25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 192;

        System.out.println(isFascinating(n));
    }

    static boolean isFascinating(int n) {
        boolean[] ans = new boolean[10];

        int n1 = 2 * n;
        int n2 = 3 * n;

        while (n > 0) {
            ans[n % 10] = true;
            ans[n1 % 10] = true;
            ans[n2 % 10] = true;
            n = n / 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }

        for (int i = 1; i < 10; i++) {
            if (!ans[i]) {
                return false;
            }
        }

        return true;
    }
}
