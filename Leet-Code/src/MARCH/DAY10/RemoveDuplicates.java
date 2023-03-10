package MARCH.DAY10;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 55, 6, 4, 2, 7};
        ArrayList list = (ArrayList) RmDup (arr);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }

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
