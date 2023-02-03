package FEBRUARY.DAY3;

public class PowerofTwo {
    public static void main(String[] args) {
        boolean ans = isPowerOfTwo(5);
        System.out.println(ans);

    }

    static boolean isPowerOfTwo(int num) {
        if (num == 1) {
            return true;
        }

        if (num <= 0) {
            return false;
        }

        if (num > 1) {
            if (num%2 ==0 && isPowerOfTwo(num/2)) {
                return true;
            }
        }

        return false;
    }
}
