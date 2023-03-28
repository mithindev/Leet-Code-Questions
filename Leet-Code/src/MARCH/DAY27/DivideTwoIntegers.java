package MARCH.DAY27;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(Integer.MIN_VALUE, 2));
    }

    static int divide(int a, int b) {
        int sign = 1;

        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }
        if (a < 0 || b < 0) {
            if (a < 0 && b < 0) {
                if (a ==Integer.MIN_VALUE) {
                    a = Integer.MAX_VALUE;
                }
                a = -1 * a;
                b = -1 * b;
            } else {
                sign = -1;
                if (a < 0) {
                    if (a ==Integer.MIN_VALUE) {
                        a = Integer.MAX_VALUE;
                    }
                    a = -1 * a;
                }
                if (b < 0) {
                    b = -1 * b;
                }
            }
        }
        if (b == 1) {
            return sign * a;
        }
        return sign * (int) Math.pow(10, (Math.log10(a) - Math.log10(b)));
    }
}
