import java.lang.Math;

public class SumTwoIntegers {
    public static void main(String[] args) {
        int ans = getSum(-999, 0);
        System.out.println(ans);
    }

    static int getSum(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return (int) Math.log10(Math.pow(10,a)*Math.pow(10,b));
    }


}
