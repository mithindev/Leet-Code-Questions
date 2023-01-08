package JANUARY.DAY8;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int a = 1234;

        int ans = reverse (a);
        System.out.println(ans);

    }
    static int reverse (int num){
        int cnt = count (num);

        int ans = 0;
        while (num > 0) {
            int digit = num%10;
            ans += digit * power(10, cnt-1);
            cnt--;
            num = num/10;
        }
        return ans;
    }

    static int power(int base, int powerRaised) {
        if (powerRaised != 0) {

            // recursive call to power()
            return (base * power(base, powerRaised - 1));
        }
        else {
            return 1;
        }
    }

    static int count (int num) {
        int count = 0;
        while (num > 0) {
            count ++;
            num = num/10;
        }
        return count;
    }

}
