package FEBRUARY.DAY13;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CountSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1};
        List<Integer> ans = countSmaller(arr);

        for (int i : ans) {
            System.out.println(i);
        }


    }

    static List<Integer> countSmaller(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            int temp = fn (arr, i);
            ans.add(temp);
        }
        ans.add(0);
        return ans;
    }

    static int fn (int[] arr, int index) {
        int count = 0;

        for (int i = index; i <arr.length; i++) {
            if (arr[index] > arr[i]) {
                count++;
            }
        }
        return count;
    }
}
