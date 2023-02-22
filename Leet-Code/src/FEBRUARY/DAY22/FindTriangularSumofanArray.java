package FEBRUARY.DAY22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class FindTriangularSumofanArray {
    public static void main(String[] args) {
        int[] arr = {5};
        System.out.println(triangularSum(arr));

    }

    static int triangularSum(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        temp = ArrtoList(arr);
        List<Integer> ans = new ArrayList<>();

        if (temp.size() == 1) {
            return temp.get(0);
        }

        for (int i = 0; i < temp.size()-1; i++) {
            int t = temp.get(i) + temp.get(i+1);
            ans.add(last(t));
        }
        if (ans.size() == 1) {
            return ans.get(0);
        } else {
            return triangularSum(listToArr(ans));
        }



    }

    static List<Integer> ArrtoList (int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(last(arr[i]));
        }
        return ans;
    }

    static int[] listToArr (List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = last(list.get(i));
        }
        return arr;
    }

    static int last(int num) {
        return num%10;
    }

}
