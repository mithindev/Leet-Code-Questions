package JANUARY.DAY4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num);
        int ans = reverse(num);
        System.out.println(ans);

    }
    static int reverse(int n) {
        int temp = n;
        int ans = 0;
        int len = count(n);
        for (int i = len-1; i >= 0 ; i--) {
            int digit = temp%10;
            ans = ans+digit*power(10,i);
            temp = temp/10;
        }
        return ans;

    }

    static int count(int num) {
        int count = 0;
        int n =num;
        while (n > 0) {
            count++;
            n /=10;
        }
        return count;
    }

    static int power (int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x*power(x, y-1);
    }

}
