package AUGUST.DAY3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                ans.add(index);
            }

            arr[index] = - arr[index];
        }

        return ans;
    }
}
