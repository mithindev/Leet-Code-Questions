package MARCH.DAY10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopKFrequentElements {
    public static void main(String[] args) {

    }

    static int[] topKFrequent(int[] arr, int k) {

    }

    static int count (int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    static List<Integer> RmDup (int[] arr) {
        ArrayList list = new ArrayList();
        Arrays.sort(arr);
        list.add(arr[0]);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i + 1]);
            }
        }
        return list;
    }
}
