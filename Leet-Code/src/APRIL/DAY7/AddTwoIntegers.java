package APRIL.DAY7;

public class AddTwoIntegers {
    public static void main(String[] args) {
        int ans = sum(-1, 10);
        System.out.println(ans);
    }

    static int sum(int m, int n) {
        return (int) Math.log10(Math.pow(10, m) * Math.pow(10, n));
    }
}
