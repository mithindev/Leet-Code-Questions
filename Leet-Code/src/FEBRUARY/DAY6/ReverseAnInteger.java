package FEBRUARY.DAY6;
import java.lang.Math;


public class ReverseAnInteger {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverse(num));

    }

    static int count (int num) {
        int cnt = 0;
        while (num > 0) {
            cnt++;
            num /=10;
        }
        return cnt;
    }

    static int reverse (int num) {
        int ans = 0;
        int len = count(num)-1;
        int i = 0;
        while (num > 0) {
            int temp = num%10;
            ans += temp * Math.pow(10,len-i);
            i++;
            num = num/10;
        }
        return ans;
    }
}
