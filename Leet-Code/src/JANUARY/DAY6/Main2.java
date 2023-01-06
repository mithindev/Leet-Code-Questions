package JANUARY.DAY6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<List<Integer>> ans = pascalTriangle(5);
//        for (List<Integer> list : ans) {
//            System.out.println(list);
//        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }

    static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> outer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> internal = new ArrayList<>();//(outer.get(i));
            for (int j = 0;j <= i;j++ ) {
                int item = fact(i) / (fact(j) * fact(i - j));
                internal.add(item);
            }
            outer.add(internal);
        }
        return outer;

    }

    static int fact (int n) {
        if (n < 2) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
}
