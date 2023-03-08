package MARCH.DAY7;

import java.util.Arrays;
import java.util.Collections;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        System.out.println(minEatingSpeed(piles, 8));

    }

    static int minEatingSpeed(int[] piles, int h) {
        if (piles.length == h) {
            return Arrays.stream(piles).max().getAsInt();
        }

        int s = 1;
        int e = Arrays.stream(piles).max().getAsInt();

        while (s < e) {
            int mid = s + (e - s)/2;
            int Total_Eating_time = 0;
            for (int i : piles) {
                Total_Eating_time = Total_Eating_time + (i + mid -1)/mid;
            }
            if (Total_Eating_time > h) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }
}
