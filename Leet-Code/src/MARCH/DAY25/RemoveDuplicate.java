package MARCH.DAY25;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 7};
        ArrayList<Integer> temp = RmDup(arr);

        for (int i : temp) {
            System.out.print(i + ", ");
        }

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
}
