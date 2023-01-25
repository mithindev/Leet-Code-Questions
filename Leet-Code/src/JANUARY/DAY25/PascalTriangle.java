package JANUARY.DAY25;
import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
//        System.out.println(power(2,3));
        int n = 3;
        List<Integer> list = getRow(3);

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

    static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0;i < rowIndex + 1; i ++) {
            result.add(1);
            for (int j = i; j >=0; j --) {
                if (j != 0 && j != i) {
                    result.set(j, result.get(j) + result.get(j-1));
                }
            }
        }
        return result;
    }
}
