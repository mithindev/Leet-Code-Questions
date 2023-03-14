package MARCH.DAY13;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subsets(arr);


    }

    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int number : arr) {
            int l = outer.size();
            for (int i = 0; i < l; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(number);
                outer.add(internal);
            }
        }
        return outer;
    }

}
