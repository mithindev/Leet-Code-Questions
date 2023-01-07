package JANUARY.DAY7;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,0, 0, 0};
        int[] arr2 = {2, 5, 6};
        merge(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));

    }

    static void merge (int[] first, int m, int[] second, int n) {
        int[] mix = new int[m + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        for (int l = 0; l < m+n; l++) {
            first[l] = mix[l];
        }

    }
}
