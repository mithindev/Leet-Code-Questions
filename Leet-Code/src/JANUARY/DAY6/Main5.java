package JANUARY.DAY6;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<List<Integer>> outer = new ArrayList<>();

        int[] arr = {-1, 0, 1, 2, -1, -4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if ((i != j || i != k || j != k) && (arr[i] + arr[j] + arr[k] == 0)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        outer.add(list);
                    }
//                    else if (arr[i] + arr[j] + arr[k] == 0) {
//                        List<Integer> list = new ArrayList<>();
//                        list.add(arr[i]);
//                        list.add(arr[j]);
//                        list.add(arr[k]);
//                        outer.add(list);
//                    }

                }

            }

        }
        for (int i = 0; i < outer.size(); i++) {
            System.out.println(outer.get(i));
        }
    }
}
