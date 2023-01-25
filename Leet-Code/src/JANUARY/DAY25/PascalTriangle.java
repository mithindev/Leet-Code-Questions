package JANUARY.DAY25;
import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
//        System.out.println(power(2,3));
        int n = 3;
        List<Integer> list = new ArrayList<>(n+1);
        for (int i = 0; i <= n; i++) {
            int temp = fact(n)/(fact(n-i)*fact(i));
            list.add(temp);
        }
        for (int i : list) {
            System.out.println(i);
        }
    }

    static int fact (int n) {
        if (n < 2) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }

    static int power (int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x*power(x,y-1);
        }
    }
}
