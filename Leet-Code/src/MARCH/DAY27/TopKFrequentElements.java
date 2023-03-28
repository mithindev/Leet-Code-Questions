package MARCH.DAY27;

import java.util.ArrayList;
import java.util.Arrays;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int[] ans = topKFrequent(arr, 2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] topKFrequent(int[] arr, int k) {
        ArrayList<Integer> list = rmDup(arr);
        sort(list, arr);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(list.size() - i - 1);
        }
        return ans;
    }

    static ArrayList<Integer> rmDup(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    static int count (int[] arr, int target) {
        int ans = 0;
        for (int i : arr) {
            if (i == target) {
                ans++;
            }
        }
        return ans;
    }

    static void sort(ArrayList<Integer> list, int[] arr) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if (count(arr, list.get(j)) < count(arr, list.get(j - 1))) {
                    int temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }
    }
}

