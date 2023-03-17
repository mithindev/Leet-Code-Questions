package MARCH.DAY17;

import static java.lang.Integer.parseInt;

public class SumDigitsStringAfterConvert {
    public static void main(String[] args) {
        System.out.println(getLucky("zbax", 2));
    }
    static int getLucky(String s, int k) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < s.length();i++) {
            int temp = s.charAt (i) - 'a' + 1;
            ans.append(temp);
        }
        int sum = 0;
        for (int i = 0; i < ans.length(); i++) {
            int digit = ans.charAt(i) - '0';
            sum += digit;
        }
        for (int i = 2; i <= k; i++){
            sum = convert(sum);
        }
        return sum;
    }

    static int convert (int num) {
        int sum = 0;
        while (num > 0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
