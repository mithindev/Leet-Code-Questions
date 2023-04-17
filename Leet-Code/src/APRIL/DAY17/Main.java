package APRIL.DAY17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];

        int len = candies.length;

        for (int i = 1; i < len; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        boolean[] list = new boolean[len];

        for (int i = 0; i < len; i++) {
            list[i] = candies[i] + extraCandies >= max;
        }

        return list;
    }
}
