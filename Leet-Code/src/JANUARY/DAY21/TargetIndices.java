package JANUARY.DAY21;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TargetIndices {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 3};
        int target = 2;
        int len = count(arr, target);
        List<Integer> list = new ArrayList<>(len);
        Arrays.sort(arr);

        for (int i = 0;i < arr.length;i++) {
            if (arr[i] == target) {
                list.add(i);
            }
        }
        for (int i : list) {
            System.out.println(i);
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
}
