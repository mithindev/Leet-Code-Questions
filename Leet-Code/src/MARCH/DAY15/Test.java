package MARCH.DAY15;

public class Test {
    public static void main (String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    static int addDigits(int num) {
        while (num / 10 > 0) {
            num = sum(num);
        }
        return num;
    }

    static int sum (int num) {
        int temp = num;
        int ans = 0;
        while (temp > 0) {
            ans += temp%10;
            temp = temp/10;
        }
        return ans;
    }
}
