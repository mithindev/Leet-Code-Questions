package MARCH.DAY18;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(convert(19));
        System.out.println(isHappy(2));
    }

//    static boolean isHappy(int n) {
//        if (n == 1 || n == 7)
//            return true;
//        int sum = n, x = n;
//
//        while(sum > 9) {
//            sum = 0;
//
//            while (x > 0) {
//                int d = x%10;
//                sum += d*d;
//                x/=10;
//            }
//            if (sum == 1)
//                return true;
//            x = sum;
//        }
//        if(sum == 7)
//            return true;
//        return false;
//    }

    static boolean isHappy(int n) {
        int step1 = convert(n);
        int step2 = convert(convert(n));

        while (step1 != step2) {
            step1 = convert(step1);
            step2 = convert(convert(step2));
        }
        return step1 == 1;
    }

    static int convert (int num) {
        int ans = 0;
        while (num > 0) {
            int temp = num%10;
            ans += temp*temp;
            num /= 10;
        }
        return ans;
    }
}
