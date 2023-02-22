package FEBRUARY.DAY19;

import java.io.*;
import java.util.Arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0));
    }

    static int search(int[] arr, int target) {
        int s = 0;
        int e = 0;
        int pivot = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                pivot = i;
            }
        }

        if (target > pivot) {
            int[] temp = Arrays.copyOfRange(arr, pivot, arr.length);
            Arrays.sort(temp);
            return BS(temp, target);
        } else {
            int[] temp = Arrays.copyOfRange(arr, 0, pivot);
            return BS(temp, target);
        }
    }

    static int BS (int[] arr, int target) {
        int s = 0;
        int e = 0;

        while (s <= e) {
            int mid = s + (e - s)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

}
