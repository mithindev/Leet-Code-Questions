package AUGUST.DAY5;

public class Main {
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }

    static boolean digitCount(String num) {
        int temp = Integer.parseInt(num);
        char[] digits = num.toCharArray();

        for (char ch : digits) {
            int digit = ch - '0';
            if (count(temp, digit) != digit) {
                return false;
            }
        }
        return true;
    }

    static int count (int num, int target) {
        int temp = num;
        int count = 0;

        while (temp > 0) {
            if (temp % 10 == target) {
                count++;
            }
            temp /= 10;
        }

        return count;
    }

}
