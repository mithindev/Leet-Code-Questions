package MARCH.DAY25;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));

    }

    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1 = RmDup (nums1);
        ArrayList<Integer> arr2 = RmDup (nums2);
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i : arr2) {
            if (search(arr1, i)) {
                ans.add(i);
            }
        }
        int[] f = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            f[i] = ans.get(i);
        }
        return f;
    }

    static ArrayList<Integer> RmDup (int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    static boolean search (ArrayList<Integer> arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
}
