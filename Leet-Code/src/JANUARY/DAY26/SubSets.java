package JANUARY.DAY26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SubSets {
    public static void main(String[] args) {

    }

    static List<List<Integer>> perms (int[] arr) {
        List<Integer> p = new ArrayList<>();
        List<Integer> up = new ArrayList<>();

        for (int i : arr) {
            up.add(i);
        }

        List<List<Integer>> ans = new ArrayList<>();

        if (up.size() == 0) {
            ans.add(p);
        }

        int num = up.get(0);

        for (int i = 0;i <= up.size(); i++) {
            List<Integer> f = p.
        }







    }

}
