package JANUARY.DAY9;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int num = -1234;
        int ans = reverse(num);
        System.out.println(ans);



    }
    static int reverse (int num) {
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        long ans = 0;

        while (num > 0) {
            ans = ans*10 + num%10;
            num = num/10;
        }
        if (ans > Integer.MAX_VALUE) {
            return 0;
        }
        if (isNegative) {
            return (int)(-1*ans);
        } else {
            return (int)(ans);
        }
    }
}
