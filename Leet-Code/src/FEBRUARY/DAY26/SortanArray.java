package FEBRUARY.DAY26;

import java.util.Arrays;

public class SortanArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sortArray(arr)));

    }

    static int[] sortArray(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = sortArray(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge (int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[first.length + second.length];

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }
}
