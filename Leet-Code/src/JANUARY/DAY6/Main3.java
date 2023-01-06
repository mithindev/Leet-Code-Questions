package JANUARY.DAY6;

public class Main3 {
    public static void main(String[] args) {
        int ans = fact(15);
        System.out.println(ans);
        int ans1 = factorial(15);
        System.out.println(ans1);
    }

    static int fact (int n) {
        if (n < 2) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
    static int factorial(int n)
    {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }
}
