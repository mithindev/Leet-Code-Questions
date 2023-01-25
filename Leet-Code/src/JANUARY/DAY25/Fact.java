package JANUARY.DAY25;

public class Fact {
    public static void main(String[] args) {
        System.out.println(fact(13));
    }

    static int fact (int n) {
        if (n < 2) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
}
