package JANUARY.DAY25;
import java.math.BigInteger;


public class Fact {
    public static void main(String[] args) {
        System.out.println(Fact(14));
    }

    static int fact (int n) {
        BigInteger fact = BigInteger.ONE;
        if (n < 2) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }

    static BigInteger Fact (int n) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

    static long factorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        int res = 1, i;
        for (i=2; i<=n; i++) {
            res *= i;
        }
        return res;
    }
}
