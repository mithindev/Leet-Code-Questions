package SEPTEMBER;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
    }

    static List<List<Integer>> generate(int num) {
        List<List<Integer>> outer = new ArrayList<>(5);

        if (num == 0) {
            return outer;
        }

        for (int i = 0; i < num; i++) {
            List<Integer> inner = new ArrayList<>(i + 1);

            if (i == 0) {
                inner.add(1);
                outer.add(inner);
            } else {
                List<Integer> prev = outer.get(i - 1);

                for (int j = 0; j < i; j++) {  // Changed the loop condition here
                    if (j == 0 || j == i - 1) {
                        inner.add(1);
                    } else {
                        inner.add(prev.get(j) + prev.get(j - 1));
                    }
                }
                outer.add(inner);
            }
        }
        return outer;
    }

}
