package MARCH.DAY10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
//        System.out.println(Arrays.toString(RmDup(arr)));
        int[] temp = RmDup(arr);
        Sort(arr, temp);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));


    }

    static int[] topKFrequent(int[] arr, int k) {
        int[] ans = RmDup(arr);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 1; j < ans.length - 1; j++) {
                if (count(arr, ans[j]) < count(arr, ans[j-1])) {
                    int temp = ans[j];
                    ans[j] = ans[j - 1];
                    ans[j - 1] = temp;
                }
            }
        }
        int[] fans = new int[k];
        for (int i = 0; i < k; i++) {
            fans[i] = ans[ans.length - i - 1];
        }
        return fans;
    }

    static void Sort (int[] arr, int[] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 1; j < ans.length; j++) {
                if (count(arr, ans[j]) < count(arr, ans[j-1])) {
                    int temp = ans[j];
                    ans[j] = ans[j - 1];
                    ans[j - 1] = temp;
                }
            }
        }

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

    static int[] RmDup (int[] arr) {
        ArrayList list = new ArrayList();
        Arrays.sort(arr);
        list.add(arr[0]);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i + 1]);
            }
        }
        int[] ans = list.stream().mapToInt(i -> (int) i).toArray();
        return ans;
    }
}
