package APRIL.DAY9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(arr);
//        System.out.println(Arrays.toString(list));
        for (int i : list) {
            System.out.print(i + ", ");
        }
    }


    static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != i+1) {
//                list.add(i+1);
//            }
//        }
//        return list;

        for (int i = 0; i < arr.length; i++) {
            if (!search(arr, i+1)) {
                list.add(i+1);
            }
        }
        return list;
    }

    static boolean search (int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s)/2;
            if (arr[mid] == target) {
                return true;
            }
            if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }

    static ArrayList<Integer> rmDup (int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i+1]) {
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length]);
        return list;
    }
}
